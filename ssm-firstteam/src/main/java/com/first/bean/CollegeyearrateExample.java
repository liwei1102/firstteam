package com.first.bean;

import java.util.ArrayList;
import java.util.List;

public class CollegeyearrateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollegeyearrateExample() {
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

        public Criteria andCollegeyearrateidIsNull() {
            addCriterion("collegeyearrateid is null");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidIsNotNull() {
            addCriterion("collegeyearrateid is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidEqualTo(Integer value) {
            addCriterion("collegeyearrateid =", value, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidNotEqualTo(Integer value) {
            addCriterion("collegeyearrateid <>", value, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidGreaterThan(Integer value) {
            addCriterion("collegeyearrateid >", value, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collegeyearrateid >=", value, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidLessThan(Integer value) {
            addCriterion("collegeyearrateid <", value, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidLessThanOrEqualTo(Integer value) {
            addCriterion("collegeyearrateid <=", value, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidIn(List<Integer> values) {
            addCriterion("collegeyearrateid in", values, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidNotIn(List<Integer> values) {
            addCriterion("collegeyearrateid not in", values, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidBetween(Integer value1, Integer value2) {
            addCriterion("collegeyearrateid between", value1, value2, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeyearrateidNotBetween(Integer value1, Integer value2) {
            addCriterion("collegeyearrateid not between", value1, value2, "collegeyearrateid");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNull() {
            addCriterion("collegeid is null");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNotNull() {
            addCriterion("collegeid is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeidEqualTo(Integer value) {
            addCriterion("collegeid =", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotEqualTo(Integer value) {
            addCriterion("collegeid <>", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThan(Integer value) {
            addCriterion("collegeid >", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collegeid >=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThan(Integer value) {
            addCriterion("collegeid <", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThanOrEqualTo(Integer value) {
            addCriterion("collegeid <=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidIn(List<Integer> values) {
            addCriterion("collegeid in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotIn(List<Integer> values) {
            addCriterion("collegeid not in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidBetween(Integer value1, Integer value2) {
            addCriterion("collegeid between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotBetween(Integer value1, Integer value2) {
            addCriterion("collegeid not between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("years is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("years is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(String value) {
            addCriterion("years =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(String value) {
            addCriterion("years <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(String value) {
            addCriterion("years >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(String value) {
            addCriterion("years >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(String value) {
            addCriterion("years <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(String value) {
            addCriterion("years <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLike(String value) {
            addCriterion("years like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotLike(String value) {
            addCriterion("years not like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<String> values) {
            addCriterion("years in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<String> values) {
            addCriterion("years not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(String value1, String value2) {
            addCriterion("years between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(String value1, String value2) {
            addCriterion("years not between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andAnveragerateIsNull() {
            addCriterion("anveragerate is null");
            return (Criteria) this;
        }

        public Criteria andAnveragerateIsNotNull() {
            addCriterion("anveragerate is not null");
            return (Criteria) this;
        }

        public Criteria andAnveragerateEqualTo(String value) {
            addCriterion("anveragerate =", value, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateNotEqualTo(String value) {
            addCriterion("anveragerate <>", value, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateGreaterThan(String value) {
            addCriterion("anveragerate >", value, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateGreaterThanOrEqualTo(String value) {
            addCriterion("anveragerate >=", value, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateLessThan(String value) {
            addCriterion("anveragerate <", value, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateLessThanOrEqualTo(String value) {
            addCriterion("anveragerate <=", value, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateLike(String value) {
            addCriterion("anveragerate like", value, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateNotLike(String value) {
            addCriterion("anveragerate not like", value, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateIn(List<String> values) {
            addCriterion("anveragerate in", values, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateNotIn(List<String> values) {
            addCriterion("anveragerate not in", values, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateBetween(String value1, String value2) {
            addCriterion("anveragerate between", value1, value2, "anveragerate");
            return (Criteria) this;
        }

        public Criteria andAnveragerateNotBetween(String value1, String value2) {
            addCriterion("anveragerate not between", value1, value2, "anveragerate");
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