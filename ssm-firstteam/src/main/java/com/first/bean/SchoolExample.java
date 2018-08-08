package com.first.bean;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andSchoolidIsNull() {
            addCriterion("schoolid is null");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNotNull() {
            addCriterion("schoolid is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolidEqualTo(Integer value) {
            addCriterion("schoolid =", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotEqualTo(Integer value) {
            addCriterion("schoolid <>", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThan(Integer value) {
            addCriterion("schoolid >", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolid >=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThan(Integer value) {
            addCriterion("schoolid <", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThanOrEqualTo(Integer value) {
            addCriterion("schoolid <=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidIn(List<Integer> values) {
            addCriterion("schoolid in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotIn(List<Integer> values) {
            addCriterion("schoolid not in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidBetween(Integer value1, Integer value2) {
            addCriterion("schoolid between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolid not between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("schoolname is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("schoolname is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("schoolname =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("schoolname <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("schoolname >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolname >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("schoolname <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("schoolname <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("schoolname like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("schoolname not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("schoolname in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("schoolname not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("schoolname between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("schoolname not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNull() {
            addCriterion("englishname is null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNotNull() {
            addCriterion("englishname is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameEqualTo(String value) {
            addCriterion("englishname =", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotEqualTo(String value) {
            addCriterion("englishname <>", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThan(String value) {
            addCriterion("englishname >", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("englishname >=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThan(String value) {
            addCriterion("englishname <", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("englishname <=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLike(String value) {
            addCriterion("englishname like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotLike(String value) {
            addCriterion("englishname not like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIn(List<String> values) {
            addCriterion("englishname in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotIn(List<String> values) {
            addCriterion("englishname not in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameBetween(String value1, String value2) {
            addCriterion("englishname between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotBetween(String value1, String value2) {
            addCriterion("englishname not between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIsNull() {
            addCriterion("schooltype is null");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIsNotNull() {
            addCriterion("schooltype is not null");
            return (Criteria) this;
        }

        public Criteria andSchooltypeEqualTo(String value) {
            addCriterion("schooltype =", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotEqualTo(String value) {
            addCriterion("schooltype <>", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeGreaterThan(String value) {
            addCriterion("schooltype >", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeGreaterThanOrEqualTo(String value) {
            addCriterion("schooltype >=", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeLessThan(String value) {
            addCriterion("schooltype <", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeLessThanOrEqualTo(String value) {
            addCriterion("schooltype <=", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeLike(String value) {
            addCriterion("schooltype like", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotLike(String value) {
            addCriterion("schooltype not like", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIn(List<String> values) {
            addCriterion("schooltype in", values, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotIn(List<String> values) {
            addCriterion("schooltype not in", values, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeBetween(String value1, String value2) {
            addCriterion("schooltype between", value1, value2, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotBetween(String value1, String value2) {
            addCriterion("schooltype not between", value1, value2, "schooltype");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalIsNull() {
            addCriterion("nameofprincipal is null");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalIsNotNull() {
            addCriterion("nameofprincipal is not null");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalEqualTo(String value) {
            addCriterion("nameofprincipal =", value, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalNotEqualTo(String value) {
            addCriterion("nameofprincipal <>", value, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalGreaterThan(String value) {
            addCriterion("nameofprincipal >", value, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("nameofprincipal >=", value, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalLessThan(String value) {
            addCriterion("nameofprincipal <", value, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalLessThanOrEqualTo(String value) {
            addCriterion("nameofprincipal <=", value, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalLike(String value) {
            addCriterion("nameofprincipal like", value, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalNotLike(String value) {
            addCriterion("nameofprincipal not like", value, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalIn(List<String> values) {
            addCriterion("nameofprincipal in", values, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalNotIn(List<String> values) {
            addCriterion("nameofprincipal not in", values, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalBetween(String value1, String value2) {
            addCriterion("nameofprincipal between", value1, value2, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andNameofprincipalNotBetween(String value1, String value2) {
            addCriterion("nameofprincipal not between", value1, value2, "nameofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalIsNull() {
            addCriterion("telofprincipal is null");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalIsNotNull() {
            addCriterion("telofprincipal is not null");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalEqualTo(String value) {
            addCriterion("telofprincipal =", value, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalNotEqualTo(String value) {
            addCriterion("telofprincipal <>", value, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalGreaterThan(String value) {
            addCriterion("telofprincipal >", value, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("telofprincipal >=", value, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalLessThan(String value) {
            addCriterion("telofprincipal <", value, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalLessThanOrEqualTo(String value) {
            addCriterion("telofprincipal <=", value, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalLike(String value) {
            addCriterion("telofprincipal like", value, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalNotLike(String value) {
            addCriterion("telofprincipal not like", value, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalIn(List<String> values) {
            addCriterion("telofprincipal in", values, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalNotIn(List<String> values) {
            addCriterion("telofprincipal not in", values, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalBetween(String value1, String value2) {
            addCriterion("telofprincipal between", value1, value2, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofprincipalNotBetween(String value1, String value2) {
            addCriterion("telofprincipal not between", value1, value2, "telofprincipal");
            return (Criteria) this;
        }

        public Criteria andTelofschoolIsNull() {
            addCriterion("telofschool is null");
            return (Criteria) this;
        }

        public Criteria andTelofschoolIsNotNull() {
            addCriterion("telofschool is not null");
            return (Criteria) this;
        }

        public Criteria andTelofschoolEqualTo(String value) {
            addCriterion("telofschool =", value, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolNotEqualTo(String value) {
            addCriterion("telofschool <>", value, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolGreaterThan(String value) {
            addCriterion("telofschool >", value, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolGreaterThanOrEqualTo(String value) {
            addCriterion("telofschool >=", value, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolLessThan(String value) {
            addCriterion("telofschool <", value, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolLessThanOrEqualTo(String value) {
            addCriterion("telofschool <=", value, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolLike(String value) {
            addCriterion("telofschool like", value, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolNotLike(String value) {
            addCriterion("telofschool not like", value, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolIn(List<String> values) {
            addCriterion("telofschool in", values, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolNotIn(List<String> values) {
            addCriterion("telofschool not in", values, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolBetween(String value1, String value2) {
            addCriterion("telofschool between", value1, value2, "telofschool");
            return (Criteria) this;
        }

        public Criteria andTelofschoolNotBetween(String value1, String value2) {
            addCriterion("telofschool not between", value1, value2, "telofschool");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalcode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("postalcode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("postalcode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("postalcode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalcode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("postalcode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("postalcode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("postalcode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("postalcode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("postalcode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("postalcode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("postalcode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("postalcode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNull() {
            addCriterion("homepage is null");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNotNull() {
            addCriterion("homepage is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageEqualTo(String value) {
            addCriterion("homepage =", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotEqualTo(String value) {
            addCriterion("homepage <>", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThan(String value) {
            addCriterion("homepage >", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("homepage >=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThan(String value) {
            addCriterion("homepage <", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThanOrEqualTo(String value) {
            addCriterion("homepage <=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLike(String value) {
            addCriterion("homepage like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotLike(String value) {
            addCriterion("homepage not like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageIn(List<String> values) {
            addCriterion("homepage in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotIn(List<String> values) {
            addCriterion("homepage not in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageBetween(String value1, String value2) {
            addCriterion("homepage between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotBetween(String value1, String value2) {
            addCriterion("homepage not between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolIsNull() {
            addCriterion("emailofschool is null");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolIsNotNull() {
            addCriterion("emailofschool is not null");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolEqualTo(String value) {
            addCriterion("emailofschool =", value, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolNotEqualTo(String value) {
            addCriterion("emailofschool <>", value, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolGreaterThan(String value) {
            addCriterion("emailofschool >", value, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolGreaterThanOrEqualTo(String value) {
            addCriterion("emailofschool >=", value, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolLessThan(String value) {
            addCriterion("emailofschool <", value, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolLessThanOrEqualTo(String value) {
            addCriterion("emailofschool <=", value, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolLike(String value) {
            addCriterion("emailofschool like", value, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolNotLike(String value) {
            addCriterion("emailofschool not like", value, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolIn(List<String> values) {
            addCriterion("emailofschool in", values, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolNotIn(List<String> values) {
            addCriterion("emailofschool not in", values, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolBetween(String value1, String value2) {
            addCriterion("emailofschool between", value1, value2, "emailofschool");
            return (Criteria) this;
        }

        public Criteria andEmailofschoolNotBetween(String value1, String value2) {
            addCriterion("emailofschool not between", value1, value2, "emailofschool");
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