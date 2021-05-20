package com.cvs.cdc.reader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.cvs.cdc.model.CdcRequestToApi;
import org.springframework.batch.item.database.Order;
import org.springframework.batch.item.database.orm.AbstractJpaQueryProvider;
import org.springframework.batch.item.database.support.AbstractSqlPagingQueryProvider;
import org.springframework.batch.item.database.support.SqlPagingQueryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.Iterator;
import java.util.Map;

public class JpaQueryProviderImpl<E> extends AbstractJpaQueryProvider/*, AbstractSqlPagingQueryProvider*/ {

  private Class<E> entityClass;

  private String query;

  @Autowired
  @Qualifier("entityManagerFactory")
  private EntityManagerFactory entityManagerFactory;

  @Override
  public Query createQuery() {
    //return getEntityManager().createQuery(query, CdcRequestToApi.class);
    return getEntityManager().createNativeQuery("select * from IDW_APPS_STG_VW.IMM_COVID_IDNTFD_EXTRACT where actvy_typ_cd is null\n" +
            "order by JOB_NM\n" + "asc" +
            ",EXTR_DT asc,RXC_IMM_ID asc;", CdcRequestToApi.class);
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public void setEntityClass(Class<E> entityClazz) {
    this.entityClass = entityClazz;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    Assert.isTrue(StringUtils.hasText(query), "Query cannot be empty");
    Assert.notNull(entityClass, "Entity class cannot be NULL");
  }

 /* @Override
  public String generateFirstPageQuery(int pageSize) {
    return SqlPagingQueryUtils.generateRowNumSqlQuery(this, false, this.buildRowNumClause(pageSize));
  }

  @Override
  public String generateRemainingPagesQuery(int pageSize) {
    return SqlPagingQueryUtils.generateRowNumSqlQuery(this, false, this.buildRowNumClause(pageSize));
  }

  @Override
  public String generateJumpToItemQuery(int itemIndex, int pageSize) {
    int page = itemIndex / pageSize;
    int offset = page * pageSize;
    offset = offset == 0 ? 1 : offset;
    String sortKeySelect = this.getSortKeySelect();
    return SqlPagingQueryUtils.generateRowNumSqlQueryWithNesting(this, sortKeySelect, sortKeySelect, false,
            "TMP_ROW_NUM = " + offset);

  }

  private String getSortKeySelect() {

    StringBuilder sql = new StringBuilder();
    String prefix = "";
    Iterator var3 = this.getSortKeys().entrySet().iterator();

    while (var3.hasNext()) {

      Map.Entry<String, Order> sortKey = (Map.Entry) var3.next();
      sql.append(prefix);
      prefix = ", ";
      sql.append((String) sortKey.getKey());

    }

    return sql.toString();
  }
*/
  private String buildRowNumClause(int pageSize) {

    return pageSize + " = " + pageSize;
  }
}