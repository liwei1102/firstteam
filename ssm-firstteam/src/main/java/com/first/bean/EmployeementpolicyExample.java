package com.first.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeementpolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeementpolicyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPolicyidIsNull() {
            addCriterion("policyid is null");
            return (Criteria) this;
        }

        public Criteria andPolicyidIsNotNull() {
            addCriterion("policyid is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyidEqualTo(Integer value) {
            addCriterion("policyid =", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidNotEqualTo(Integer value) {
            addCriterion("policyid <>", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidGreaterThan(Integer value) {
            addCriterion("policyid >", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("policyid >=", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidLessThan(Integer value) {
            addCriterion("policyid <", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidLessThanOrEqualTo(Integer value) {
            addCriterion("policyid <=", value, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidIn(List<Integer> values) {
            addCriterion("policyid in", values, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidNotIn(List<Integer> values) {
            addCriterion("policyid not in", values, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidBetween(Integer value1, Integer value2) {
            addCriterion("policyid between", value1, value2, "policyid");
            return (Criteria) this;
        }

        public Criteria andPolicyidNotBetween(Integer value1, Integer value2) {
            addCriterion("policyid not between", value1, value2, "policyid");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("adminid is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminid is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminid =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminid <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminid >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminid >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminid <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminid <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminid in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminid not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminid between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminid not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andPolicynameIsNull() {
            addCriterion("policyname is null");
            return (Criteria) this;
        }

        public Criteria andPolicynameIsNotNull() {
            addCriterion("policyname is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynameEqualTo(String value) {
            addCriterion("policyname =", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotEqualTo(String value) {
            addCriterion("policyname <>", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameGreaterThan(String value) {
            addCriterion("policyname >", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameGreaterThanOrEqualTo(String value) {
            addCriterion("policyname >=", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLessThan(String value) {
            addCriterion("policyname <", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLessThanOrEqualTo(String value) {
            addCriterion("policyname <=", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameLike(String value) {
            addCriterion("policyname like", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotLike(String value) {
            addCriterion("policyname not like", value, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameIn(List<String> values) {
            addCriterion("policyname in", values, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotIn(List<String> values) {
            addCriterion("policyname not in", values, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameBetween(String value1, String value2) {
            addCriterion("policyname between", value1, value2, "policyname");
            return (Criteria) this;
        }

        public Criteria andPolicynameNotBetween(String value1, String value2) {
            addCriterion("policyname not between", value1, value2, "policyname");
            return (Criteria) this;
        }

        public Criteria andIssuerIsNull() {
            addCriterion("issuer is null");
            return (Criteria) this;
        }

        public Criteria andIssuerIsNotNull() {
            addCriterion("issuer is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerEqualTo(String value) {
            addCriterion("issuer =", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotEqualTo(String value) {
            addCriterion("issuer <>", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerGreaterThan(String value) {
            addCriterion("issuer >", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerGreaterThanOrEqualTo(String value) {
            addCriterion("issuer >=", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLessThan(String value) {
            addCriterion("issuer <", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLessThanOrEqualTo(String value) {
            addCriterion("issuer <=", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerLike(String value) {
            addCriterion("issuer like", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotLike(String value) {
            addCriterion("issuer not like", value, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerIn(List<String> values) {
            addCriterion("issuer in", values, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotIn(List<String> values) {
            addCriterion("issuer not in", values, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerBetween(String value1, String value2) {
            addCriterion("issuer between", value1, value2, "issuer");
            return (Criteria) this;
        }

        public Criteria andIssuerNotBetween(String value1, String value2) {
            addCriterion("issuer not between", value1, value2, "issuer");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("publishdate is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("publishdate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(Date value) {
            addCriterionForJDBCDate("publishdate =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("publishdate <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(Date value) {
            addCriterionForJDBCDate("publishdate >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishdate >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(Date value) {
            addCriterionForJDBCDate("publishdate <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishdate <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<Date> values) {
            addCriterionForJDBCDate("publishdate in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("publishdate not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishdate between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishdate not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andAuditunitIsNull() {
            addCriterion("auditunit is null");
            return (Criteria) this;
        }

        public Criteria andAuditunitIsNotNull() {
            addCriterion("auditunit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditunitEqualTo(String value) {
            addCriterion("auditunit =", value, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitNotEqualTo(String value) {
            addCriterion("auditunit <>", value, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitGreaterThan(String value) {
            addCriterion("auditunit >", value, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitGreaterThanOrEqualTo(String value) {
            addCriterion("auditunit >=", value, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitLessThan(String value) {
            addCriterion("auditunit <", value, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitLessThanOrEqualTo(String value) {
            addCriterion("auditunit <=", value, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitLike(String value) {
            addCriterion("auditunit like", value, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitNotLike(String value) {
            addCriterion("auditunit not like", value, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitIn(List<String> values) {
            addCriterion("auditunit in", values, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitNotIn(List<String> values) {
            addCriterion("auditunit not in", values, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitBetween(String value1, String value2) {
            addCriterion("auditunit between", value1, value2, "auditunit");
            return (Criteria) this;
        }

        public Criteria andAuditunitNotBetween(String value1, String value2) {
            addCriterion("auditunit not between", value1, value2, "auditunit");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}