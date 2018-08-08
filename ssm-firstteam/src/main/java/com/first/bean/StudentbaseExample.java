package com.first.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentbaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentbaseExample() {
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

        public Criteria andStuloginidIsNull() {
            addCriterion("stuloginid is null");
            return (Criteria) this;
        }

        public Criteria andStuloginidIsNotNull() {
            addCriterion("stuloginid is not null");
            return (Criteria) this;
        }

        public Criteria andStuloginidEqualTo(Integer value) {
            addCriterion("stuloginid =", value, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidNotEqualTo(Integer value) {
            addCriterion("stuloginid <>", value, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidGreaterThan(Integer value) {
            addCriterion("stuloginid >", value, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuloginid >=", value, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidLessThan(Integer value) {
            addCriterion("stuloginid <", value, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidLessThanOrEqualTo(Integer value) {
            addCriterion("stuloginid <=", value, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidIn(List<Integer> values) {
            addCriterion("stuloginid in", values, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidNotIn(List<Integer> values) {
            addCriterion("stuloginid not in", values, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidBetween(Integer value1, Integer value2) {
            addCriterion("stuloginid between", value1, value2, "stuloginid");
            return (Criteria) this;
        }

        public Criteria andStuloginidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuloginid not between", value1, value2, "stuloginid");
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentid is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentid is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentid =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentid <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentid >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentid >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentid <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentid <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentid in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentid not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentid between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentid not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberIsNull() {
            addCriterion("identifynumber is null");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberIsNotNull() {
            addCriterion("identifynumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberEqualTo(String value) {
            addCriterion("identifynumber =", value, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberNotEqualTo(String value) {
            addCriterion("identifynumber <>", value, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberGreaterThan(String value) {
            addCriterion("identifynumber >", value, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberGreaterThanOrEqualTo(String value) {
            addCriterion("identifynumber >=", value, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberLessThan(String value) {
            addCriterion("identifynumber <", value, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberLessThanOrEqualTo(String value) {
            addCriterion("identifynumber <=", value, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberLike(String value) {
            addCriterion("identifynumber like", value, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberNotLike(String value) {
            addCriterion("identifynumber not like", value, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberIn(List<String> values) {
            addCriterion("identifynumber in", values, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberNotIn(List<String> values) {
            addCriterion("identifynumber not in", values, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberBetween(String value1, String value2) {
            addCriterion("identifynumber between", value1, value2, "identifynumber");
            return (Criteria) this;
        }

        public Criteria andIdentifynumberNotBetween(String value1, String value2) {
            addCriterion("identifynumber not between", value1, value2, "identifynumber");
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

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andOriginplaceIsNull() {
            addCriterion("originplace is null");
            return (Criteria) this;
        }

        public Criteria andOriginplaceIsNotNull() {
            addCriterion("originplace is not null");
            return (Criteria) this;
        }

        public Criteria andOriginplaceEqualTo(String value) {
            addCriterion("originplace =", value, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceNotEqualTo(String value) {
            addCriterion("originplace <>", value, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceGreaterThan(String value) {
            addCriterion("originplace >", value, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceGreaterThanOrEqualTo(String value) {
            addCriterion("originplace >=", value, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceLessThan(String value) {
            addCriterion("originplace <", value, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceLessThanOrEqualTo(String value) {
            addCriterion("originplace <=", value, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceLike(String value) {
            addCriterion("originplace like", value, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceNotLike(String value) {
            addCriterion("originplace not like", value, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceIn(List<String> values) {
            addCriterion("originplace in", values, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceNotIn(List<String> values) {
            addCriterion("originplace not in", values, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceBetween(String value1, String value2) {
            addCriterion("originplace between", value1, value2, "originplace");
            return (Criteria) this;
        }

        public Criteria andOriginplaceNotBetween(String value1, String value2) {
            addCriterion("originplace not between", value1, value2, "originplace");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andLengthsIsNull() {
            addCriterion("lengths is null");
            return (Criteria) this;
        }

        public Criteria andLengthsIsNotNull() {
            addCriterion("lengths is not null");
            return (Criteria) this;
        }

        public Criteria andLengthsEqualTo(String value) {
            addCriterion("lengths =", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsNotEqualTo(String value) {
            addCriterion("lengths <>", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsGreaterThan(String value) {
            addCriterion("lengths >", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsGreaterThanOrEqualTo(String value) {
            addCriterion("lengths >=", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsLessThan(String value) {
            addCriterion("lengths <", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsLessThanOrEqualTo(String value) {
            addCriterion("lengths <=", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsLike(String value) {
            addCriterion("lengths like", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsNotLike(String value) {
            addCriterion("lengths not like", value, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsIn(List<String> values) {
            addCriterion("lengths in", values, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsNotIn(List<String> values) {
            addCriterion("lengths not in", values, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsBetween(String value1, String value2) {
            addCriterion("lengths between", value1, value2, "lengths");
            return (Criteria) this;
        }

        public Criteria andLengthsNotBetween(String value1, String value2) {
            addCriterion("lengths not between", value1, value2, "lengths");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusIsNull() {
            addCriterion("politticalstatus is null");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusIsNotNull() {
            addCriterion("politticalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusEqualTo(String value) {
            addCriterion("politticalstatus =", value, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusNotEqualTo(String value) {
            addCriterion("politticalstatus <>", value, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusGreaterThan(String value) {
            addCriterion("politticalstatus >", value, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("politticalstatus >=", value, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusLessThan(String value) {
            addCriterion("politticalstatus <", value, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusLessThanOrEqualTo(String value) {
            addCriterion("politticalstatus <=", value, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusLike(String value) {
            addCriterion("politticalstatus like", value, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusNotLike(String value) {
            addCriterion("politticalstatus not like", value, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusIn(List<String> values) {
            addCriterion("politticalstatus in", values, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusNotIn(List<String> values) {
            addCriterion("politticalstatus not in", values, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusBetween(String value1, String value2) {
            addCriterion("politticalstatus between", value1, value2, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andPolitticalstatusNotBetween(String value1, String value2) {
            addCriterion("politticalstatus not between", value1, value2, "politticalstatus");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
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