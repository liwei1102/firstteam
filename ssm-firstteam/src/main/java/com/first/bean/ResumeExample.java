package com.first.bean;

import java.util.ArrayList;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeid is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeid is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(Integer value) {
            addCriterion("resumeid =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(Integer value) {
            addCriterion("resumeid <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(Integer value) {
            addCriterion("resumeid >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeid >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(Integer value) {
            addCriterion("resumeid <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(Integer value) {
            addCriterion("resumeid <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<Integer> values) {
            addCriterion("resumeid in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<Integer> values) {
            addCriterion("resumeid not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(Integer value1, Integer value2) {
            addCriterion("resumeid between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeid not between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andStuextendidIsNull() {
            addCriterion("stuextendid is null");
            return (Criteria) this;
        }

        public Criteria andStuextendidIsNotNull() {
            addCriterion("stuextendid is not null");
            return (Criteria) this;
        }

        public Criteria andStuextendidEqualTo(Integer value) {
            addCriterion("stuextendid =", value, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidNotEqualTo(Integer value) {
            addCriterion("stuextendid <>", value, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidGreaterThan(Integer value) {
            addCriterion("stuextendid >", value, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuextendid >=", value, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidLessThan(Integer value) {
            addCriterion("stuextendid <", value, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidLessThanOrEqualTo(Integer value) {
            addCriterion("stuextendid <=", value, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidIn(List<Integer> values) {
            addCriterion("stuextendid in", values, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidNotIn(List<Integer> values) {
            addCriterion("stuextendid not in", values, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidBetween(Integer value1, Integer value2) {
            addCriterion("stuextendid between", value1, value2, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andStuextendidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuextendid not between", value1, value2, "stuextendid");
            return (Criteria) this;
        }

        public Criteria andResumestatusIsNull() {
            addCriterion("resumestatus is null");
            return (Criteria) this;
        }

        public Criteria andResumestatusIsNotNull() {
            addCriterion("resumestatus is not null");
            return (Criteria) this;
        }

        public Criteria andResumestatusEqualTo(String value) {
            addCriterion("resumestatus =", value, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusNotEqualTo(String value) {
            addCriterion("resumestatus <>", value, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusGreaterThan(String value) {
            addCriterion("resumestatus >", value, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusGreaterThanOrEqualTo(String value) {
            addCriterion("resumestatus >=", value, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusLessThan(String value) {
            addCriterion("resumestatus <", value, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusLessThanOrEqualTo(String value) {
            addCriterion("resumestatus <=", value, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusLike(String value) {
            addCriterion("resumestatus like", value, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusNotLike(String value) {
            addCriterion("resumestatus not like", value, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusIn(List<String> values) {
            addCriterion("resumestatus in", values, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusNotIn(List<String> values) {
            addCriterion("resumestatus not in", values, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusBetween(String value1, String value2) {
            addCriterion("resumestatus between", value1, value2, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andResumestatusNotBetween(String value1, String value2) {
            addCriterion("resumestatus not between", value1, value2, "resumestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeedIsNull() {
            addCriterion("employeed is null");
            return (Criteria) this;
        }

        public Criteria andEmployeedIsNotNull() {
            addCriterion("employeed is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeedEqualTo(Boolean value) {
            addCriterion("employeed =", value, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedNotEqualTo(Boolean value) {
            addCriterion("employeed <>", value, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedGreaterThan(Boolean value) {
            addCriterion("employeed >", value, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("employeed >=", value, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedLessThan(Boolean value) {
            addCriterion("employeed <", value, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedLessThanOrEqualTo(Boolean value) {
            addCriterion("employeed <=", value, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedIn(List<Boolean> values) {
            addCriterion("employeed in", values, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedNotIn(List<Boolean> values) {
            addCriterion("employeed not in", values, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedBetween(Boolean value1, Boolean value2) {
            addCriterion("employeed between", value1, value2, "employeed");
            return (Criteria) this;
        }

        public Criteria andEmployeedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("employeed not between", value1, value2, "employeed");
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