package com.first.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("newsid is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("newsid is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("newsid =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("newsid <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("newsid >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsid >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("newsid <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("newsid <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("newsid in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("newsid not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("newsid between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsid not between", value1, value2, "newsid");
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

        public Criteria andNewsheadIsNull() {
            addCriterion("newshead is null");
            return (Criteria) this;
        }

        public Criteria andNewsheadIsNotNull() {
            addCriterion("newshead is not null");
            return (Criteria) this;
        }

        public Criteria andNewsheadEqualTo(String value) {
            addCriterion("newshead =", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadNotEqualTo(String value) {
            addCriterion("newshead <>", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadGreaterThan(String value) {
            addCriterion("newshead >", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadGreaterThanOrEqualTo(String value) {
            addCriterion("newshead >=", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadLessThan(String value) {
            addCriterion("newshead <", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadLessThanOrEqualTo(String value) {
            addCriterion("newshead <=", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadLike(String value) {
            addCriterion("newshead like", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadNotLike(String value) {
            addCriterion("newshead not like", value, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadIn(List<String> values) {
            addCriterion("newshead in", values, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadNotIn(List<String> values) {
            addCriterion("newshead not in", values, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadBetween(String value1, String value2) {
            addCriterion("newshead between", value1, value2, "newshead");
            return (Criteria) this;
        }

        public Criteria andNewsheadNotBetween(String value1, String value2) {
            addCriterion("newshead not between", value1, value2, "newshead");
            return (Criteria) this;
        }

        public Criteria andPublishcompIsNull() {
            addCriterion("publishcomp is null");
            return (Criteria) this;
        }

        public Criteria andPublishcompIsNotNull() {
            addCriterion("publishcomp is not null");
            return (Criteria) this;
        }

        public Criteria andPublishcompEqualTo(String value) {
            addCriterion("publishcomp =", value, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompNotEqualTo(String value) {
            addCriterion("publishcomp <>", value, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompGreaterThan(String value) {
            addCriterion("publishcomp >", value, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompGreaterThanOrEqualTo(String value) {
            addCriterion("publishcomp >=", value, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompLessThan(String value) {
            addCriterion("publishcomp <", value, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompLessThanOrEqualTo(String value) {
            addCriterion("publishcomp <=", value, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompLike(String value) {
            addCriterion("publishcomp like", value, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompNotLike(String value) {
            addCriterion("publishcomp not like", value, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompIn(List<String> values) {
            addCriterion("publishcomp in", values, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompNotIn(List<String> values) {
            addCriterion("publishcomp not in", values, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompBetween(String value1, String value2) {
            addCriterion("publishcomp between", value1, value2, "publishcomp");
            return (Criteria) this;
        }

        public Criteria andPublishcompNotBetween(String value1, String value2) {
            addCriterion("publishcomp not between", value1, value2, "publishcomp");
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

        public Criteria andReaderscopeIsNull() {
            addCriterion("readerscope is null");
            return (Criteria) this;
        }

        public Criteria andReaderscopeIsNotNull() {
            addCriterion("readerscope is not null");
            return (Criteria) this;
        }

        public Criteria andReaderscopeEqualTo(Boolean value) {
            addCriterion("readerscope =", value, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeNotEqualTo(Boolean value) {
            addCriterion("readerscope <>", value, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeGreaterThan(Boolean value) {
            addCriterion("readerscope >", value, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("readerscope >=", value, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeLessThan(Boolean value) {
            addCriterion("readerscope <", value, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeLessThanOrEqualTo(Boolean value) {
            addCriterion("readerscope <=", value, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeIn(List<Boolean> values) {
            addCriterion("readerscope in", values, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeNotIn(List<Boolean> values) {
            addCriterion("readerscope not in", values, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeBetween(Boolean value1, Boolean value2) {
            addCriterion("readerscope between", value1, value2, "readerscope");
            return (Criteria) this;
        }

        public Criteria andReaderscopeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("readerscope not between", value1, value2, "readerscope");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
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