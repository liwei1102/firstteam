package com.first.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseholdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseholdExample() {
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

        public Criteria andHouseholdidIsNull() {
            addCriterion("householdid is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdidIsNotNull() {
            addCriterion("householdid is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdidEqualTo(Integer value) {
            addCriterion("householdid =", value, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidNotEqualTo(Integer value) {
            addCriterion("householdid <>", value, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidGreaterThan(Integer value) {
            addCriterion("householdid >", value, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("householdid >=", value, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidLessThan(Integer value) {
            addCriterion("householdid <", value, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidLessThanOrEqualTo(Integer value) {
            addCriterion("householdid <=", value, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidIn(List<Integer> values) {
            addCriterion("householdid in", values, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidNotIn(List<Integer> values) {
            addCriterion("householdid not in", values, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidBetween(Integer value1, Integer value2) {
            addCriterion("householdid between", value1, value2, "householdid");
            return (Criteria) this;
        }

        public Criteria andHouseholdidNotBetween(Integer value1, Integer value2) {
            addCriterion("householdid not between", value1, value2, "householdid");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuid is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuid =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuid <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuid >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuid >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuid <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuid <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuid in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuid not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuid between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuid not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBthdateIsNull() {
            addCriterion("bthdate is null");
            return (Criteria) this;
        }

        public Criteria andBthdateIsNotNull() {
            addCriterion("bthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBthdateEqualTo(Date value) {
            addCriterionForJDBCDate("bthdate =", value, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bthdate <>", value, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("bthdate >", value, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bthdate >=", value, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateLessThan(Date value) {
            addCriterionForJDBCDate("bthdate <", value, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bthdate <=", value, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateIn(List<Date> values) {
            addCriterionForJDBCDate("bthdate in", values, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bthdate not in", values, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bthdate between", value1, value2, "bthdate");
            return (Criteria) this;
        }

        public Criteria andBthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bthdate not between", value1, value2, "bthdate");
            return (Criteria) this;
        }

        public Criteria andIdentifynumIsNull() {
            addCriterion("identifynum is null");
            return (Criteria) this;
        }

        public Criteria andIdentifynumIsNotNull() {
            addCriterion("identifynum is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifynumEqualTo(String value) {
            addCriterion("identifynum =", value, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumNotEqualTo(String value) {
            addCriterion("identifynum <>", value, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumGreaterThan(String value) {
            addCriterion("identifynum >", value, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumGreaterThanOrEqualTo(String value) {
            addCriterion("identifynum >=", value, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumLessThan(String value) {
            addCriterion("identifynum <", value, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumLessThanOrEqualTo(String value) {
            addCriterion("identifynum <=", value, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumLike(String value) {
            addCriterion("identifynum like", value, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumNotLike(String value) {
            addCriterion("identifynum not like", value, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumIn(List<String> values) {
            addCriterion("identifynum in", values, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumNotIn(List<String> values) {
            addCriterion("identifynum not in", values, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumBetween(String value1, String value2) {
            addCriterion("identifynum between", value1, value2, "identifynum");
            return (Criteria) this;
        }

        public Criteria andIdentifynumNotBetween(String value1, String value2) {
            addCriterion("identifynum not between", value1, value2, "identifynum");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativeplace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativeplace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativeplace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativeplace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativeplace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativeplace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativeplace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativeplace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativeplace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativeplace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativeplace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalstatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalstatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalstatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalstatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalstatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalstatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalstatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalstatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalstatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalstatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalstatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalstatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalstatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIsNull() {
            addCriterion("educationlevel is null");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIsNotNull() {
            addCriterion("educationlevel is not null");
            return (Criteria) this;
        }

        public Criteria andEducationlevelEqualTo(String value) {
            addCriterion("educationlevel =", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotEqualTo(String value) {
            addCriterion("educationlevel <>", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelGreaterThan(String value) {
            addCriterion("educationlevel >", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelGreaterThanOrEqualTo(String value) {
            addCriterion("educationlevel >=", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelLessThan(String value) {
            addCriterion("educationlevel <", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelLessThanOrEqualTo(String value) {
            addCriterion("educationlevel <=", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelLike(String value) {
            addCriterion("educationlevel like", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotLike(String value) {
            addCriterion("educationlevel not like", value, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelIn(List<String> values) {
            addCriterion("educationlevel in", values, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotIn(List<String> values) {
            addCriterion("educationlevel not in", values, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelBetween(String value1, String value2) {
            addCriterion("educationlevel between", value1, value2, "educationlevel");
            return (Criteria) this;
        }

        public Criteria andEducationlevelNotBetween(String value1, String value2) {
            addCriterion("educationlevel not between", value1, value2, "educationlevel");
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