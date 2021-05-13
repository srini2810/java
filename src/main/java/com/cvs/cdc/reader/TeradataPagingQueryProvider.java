package com.cvs.cdc.reader;

import org.springframework.batch.item.database.Order;
import org.springframework.batch.item.database.support.AbstractSqlPagingQueryProvider;
import org.springframework.batch.item.database.support.SqlPagingQueryUtils;

import java.util.Iterator;
import java.util.Map;

public class TeradataPagingQueryProvider extends AbstractSqlPagingQueryProvider {
    @Override
    public String generateFirstPageQuery(int pageSize) {
        return SqlPagingQueryUtils.generateRowNumSqlQuery(this, false, this.buildRowNumClause(pageSize));
    }

    @Override
    public String generateRemainingPagesQuery(int pageSize) {
        return SqlPagingQueryUtils.generateRowNumSqlQuery(this, true, this.buildRowNumClause(pageSize));
    }

    @Override
    public String generateJumpToItemQuery(int itemIndex, int pageSize) {
        int page = itemIndex / pageSize;
        int offset = page * pageSize;
        offset = offset == 0 ? 1 : offset;
        String sortKeySelect = this.getSortKeySelect();
        return SqlPagingQueryUtils.generateRowNumSqlQueryWithNesting(this, sortKeySelect, sortKeySelect, false, "TMP_ROW_NUM = " + offset);
    }
    private String getSortKeySelect() {
        StringBuilder sql = new StringBuilder();
        String prefix = "";
        Iterator i$ = this.getSortKeys().entrySet().iterator();

        while(i$.hasNext()) {
            Map.Entry<String, Order> sortKey = (Map.Entry)i$.next();
            sql.append(prefix);
            prefix = ", ";
            sql.append((String)sortKey.getKey());
        }

        return sql.toString();
    }

    private String buildRowNumClause(int pageSize) {
        return "ROWNUM <= " + pageSize;
    }
}
