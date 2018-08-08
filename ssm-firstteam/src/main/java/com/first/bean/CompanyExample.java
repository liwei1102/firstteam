package com.first.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyidIsNull() {
            addCriterion("companyid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyid =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyid <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyid >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyid >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyid <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyid <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyid in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyid not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyid between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyid not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andComploginidIsNull() {
            addCriterion("comploginid is null");
            return (Criteria) this;
        }

        public Criteria andComploginidIsNotNull() {
            addCriterion("comploginid is not null");
            return (Criteria) this;
        }

        public Criteria andComploginidEqualTo(Integer value) {
            addCriterion("comploginid =", value, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidNotEqualTo(Integer value) {
            addCriterion("comploginid <>", value, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidGreaterThan(Integer value) {
            addCriterion("comploginid >", value, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comploginid >=", value, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidLessThan(Integer value) {
            addCriterion("comploginid <", value, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidLessThanOrEqualTo(Integer value) {
            addCriterion("comploginid <=", value, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidIn(List<Integer> values) {
            addCriterion("comploginid in", values, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidNotIn(List<Integer> values) {
            addCriterion("comploginid not in", values, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidBetween(Integer value1, Integer value2) {
            addCriterion("comploginid between", value1, value2, "comploginid");
            return (Criteria) this;
        }

        public Criteria andComploginidNotBetween(Integer value1, Integer value2) {
            addCriterion("comploginid not between", value1, value2, "comploginid");
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

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNull() {
            addCriterion("registerdate is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("registerdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterionForJDBCDate("registerdate >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterionForJDBCDate("registerdate <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registerdate <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterionForJDBCDate("registerdate in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registerdate not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registerdate between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registerdate not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andCompnameIsNull() {
            addCriterion("compname is null");
            return (Criteria) this;
        }

        public Criteria andCompnameIsNotNull() {
            addCriterion("compname is not null");
            return (Criteria) this;
        }

        public Criteria andCompnameEqualTo(String value) {
            addCriterion("compname =", value, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameNotEqualTo(String value) {
            addCriterion("compname <>", value, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameGreaterThan(String value) {
            addCriterion("compname >", value, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameGreaterThanOrEqualTo(String value) {
            addCriterion("compname >=", value, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameLessThan(String value) {
            addCriterion("compname <", value, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameLessThanOrEqualTo(String value) {
            addCriterion("compname <=", value, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameLike(String value) {
            addCriterion("compname like", value, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameNotLike(String value) {
            addCriterion("compname not like", value, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameIn(List<String> values) {
            addCriterion("compname in", values, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameNotIn(List<String> values) {
            addCriterion("compname not in", values, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameBetween(String value1, String value2) {
            addCriterion("compname between", value1, value2, "compname");
            return (Criteria) this;
        }

        public Criteria andCompnameNotBetween(String value1, String value2) {
            addCriterion("compname not between", value1, value2, "compname");
            return (Criteria) this;
        }

        public Criteria andFounddateIsNull() {
            addCriterion("founddate is null");
            return (Criteria) this;
        }

        public Criteria andFounddateIsNotNull() {
            addCriterion("founddate is not null");
            return (Criteria) this;
        }

        public Criteria andFounddateEqualTo(Date value) {
            addCriterionForJDBCDate("founddate =", value, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("founddate <>", value, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateGreaterThan(Date value) {
            addCriterionForJDBCDate("founddate >", value, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("founddate >=", value, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateLessThan(Date value) {
            addCriterionForJDBCDate("founddate <", value, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("founddate <=", value, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateIn(List<Date> values) {
            addCriterionForJDBCDate("founddate in", values, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("founddate not in", values, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("founddate between", value1, value2, "founddate");
            return (Criteria) this;
        }

        public Criteria andFounddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("founddate not between", value1, value2, "founddate");
            return (Criteria) this;
        }

        public Criteria andComppropertyIsNull() {
            addCriterion("compproperty is null");
            return (Criteria) this;
        }

        public Criteria andComppropertyIsNotNull() {
            addCriterion("compproperty is not null");
            return (Criteria) this;
        }

        public Criteria andComppropertyEqualTo(String value) {
            addCriterion("compproperty =", value, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyNotEqualTo(String value) {
            addCriterion("compproperty <>", value, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyGreaterThan(String value) {
            addCriterion("compproperty >", value, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyGreaterThanOrEqualTo(String value) {
            addCriterion("compproperty >=", value, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyLessThan(String value) {
            addCriterion("compproperty <", value, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyLessThanOrEqualTo(String value) {
            addCriterion("compproperty <=", value, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyLike(String value) {
            addCriterion("compproperty like", value, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyNotLike(String value) {
            addCriterion("compproperty not like", value, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyIn(List<String> values) {
            addCriterion("compproperty in", values, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyNotIn(List<String> values) {
            addCriterion("compproperty not in", values, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyBetween(String value1, String value2) {
            addCriterion("compproperty between", value1, value2, "compproperty");
            return (Criteria) this;
        }

        public Criteria andComppropertyNotBetween(String value1, String value2) {
            addCriterion("compproperty not between", value1, value2, "compproperty");
            return (Criteria) this;
        }

        public Criteria andMainpostIsNull() {
            addCriterion("mainpost is null");
            return (Criteria) this;
        }

        public Criteria andMainpostIsNotNull() {
            addCriterion("mainpost is not null");
            return (Criteria) this;
        }

        public Criteria andMainpostEqualTo(String value) {
            addCriterion("mainpost =", value, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostNotEqualTo(String value) {
            addCriterion("mainpost <>", value, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostGreaterThan(String value) {
            addCriterion("mainpost >", value, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostGreaterThanOrEqualTo(String value) {
            addCriterion("mainpost >=", value, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostLessThan(String value) {
            addCriterion("mainpost <", value, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostLessThanOrEqualTo(String value) {
            addCriterion("mainpost <=", value, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostLike(String value) {
            addCriterion("mainpost like", value, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostNotLike(String value) {
            addCriterion("mainpost not like", value, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostIn(List<String> values) {
            addCriterion("mainpost in", values, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostNotIn(List<String> values) {
            addCriterion("mainpost not in", values, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostBetween(String value1, String value2) {
            addCriterion("mainpost between", value1, value2, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainpostNotBetween(String value1, String value2) {
            addCriterion("mainpost not between", value1, value2, "mainpost");
            return (Criteria) this;
        }

        public Criteria andMainworkIsNull() {
            addCriterion("mainwork is null");
            return (Criteria) this;
        }

        public Criteria andMainworkIsNotNull() {
            addCriterion("mainwork is not null");
            return (Criteria) this;
        }

        public Criteria andMainworkEqualTo(String value) {
            addCriterion("mainwork =", value, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkNotEqualTo(String value) {
            addCriterion("mainwork <>", value, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkGreaterThan(String value) {
            addCriterion("mainwork >", value, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkGreaterThanOrEqualTo(String value) {
            addCriterion("mainwork >=", value, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkLessThan(String value) {
            addCriterion("mainwork <", value, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkLessThanOrEqualTo(String value) {
            addCriterion("mainwork <=", value, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkLike(String value) {
            addCriterion("mainwork like", value, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkNotLike(String value) {
            addCriterion("mainwork not like", value, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkIn(List<String> values) {
            addCriterion("mainwork in", values, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkNotIn(List<String> values) {
            addCriterion("mainwork not in", values, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkBetween(String value1, String value2) {
            addCriterion("mainwork between", value1, value2, "mainwork");
            return (Criteria) this;
        }

        public Criteria andMainworkNotBetween(String value1, String value2) {
            addCriterion("mainwork not between", value1, value2, "mainwork");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNull() {
            addCriterion("clicknum is null");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNotNull() {
            addCriterion("clicknum is not null");
            return (Criteria) this;
        }

        public Criteria andClicknumEqualTo(Integer value) {
            addCriterion("clicknum =", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotEqualTo(Integer value) {
            addCriterion("clicknum <>", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThan(Integer value) {
            addCriterion("clicknum >", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicknum >=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThan(Integer value) {
            addCriterion("clicknum <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThanOrEqualTo(Integer value) {
            addCriterion("clicknum <=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumIn(List<Integer> values) {
            addCriterion("clicknum in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotIn(List<Integer> values) {
            addCriterion("clicknum not in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumBetween(Integer value1, Integer value2) {
            addCriterion("clicknum between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
            addCriterion("clicknum not between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andStationIsNull() {
            addCriterion("station is null");
            return (Criteria) this;
        }

        public Criteria andStationIsNotNull() {
            addCriterion("station is not null");
            return (Criteria) this;
        }

        public Criteria andStationEqualTo(Boolean value) {
            addCriterion("station =", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotEqualTo(Boolean value) {
            addCriterion("station <>", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThan(Boolean value) {
            addCriterion("station >", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("station >=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThan(Boolean value) {
            addCriterion("station <", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThanOrEqualTo(Boolean value) {
            addCriterion("station <=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationIn(List<Boolean> values) {
            addCriterion("station in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotIn(List<Boolean> values) {
            addCriterion("station not in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationBetween(Boolean value1, Boolean value2) {
            addCriterion("station between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("station not between", value1, value2, "station");
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