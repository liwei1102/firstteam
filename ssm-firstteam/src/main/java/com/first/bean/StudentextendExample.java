package com.first.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentextendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentextendExample() {
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

        public Criteria andForeignlanguagesIsNull() {
            addCriterion("foreignlanguages is null");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesIsNotNull() {
            addCriterion("foreignlanguages is not null");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesEqualTo(String value) {
            addCriterion("foreignlanguages =", value, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesNotEqualTo(String value) {
            addCriterion("foreignlanguages <>", value, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesGreaterThan(String value) {
            addCriterion("foreignlanguages >", value, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesGreaterThanOrEqualTo(String value) {
            addCriterion("foreignlanguages >=", value, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesLessThan(String value) {
            addCriterion("foreignlanguages <", value, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesLessThanOrEqualTo(String value) {
            addCriterion("foreignlanguages <=", value, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesLike(String value) {
            addCriterion("foreignlanguages like", value, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesNotLike(String value) {
            addCriterion("foreignlanguages not like", value, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesIn(List<String> values) {
            addCriterion("foreignlanguages in", values, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesNotIn(List<String> values) {
            addCriterion("foreignlanguages not in", values, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesBetween(String value1, String value2) {
            addCriterion("foreignlanguages between", value1, value2, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForeignlanguagesNotBetween(String value1, String value2) {
            addCriterion("foreignlanguages not between", value1, value2, "foreignlanguages");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyIsNull() {
            addCriterion("forlangproficiency is null");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyIsNotNull() {
            addCriterion("forlangproficiency is not null");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyEqualTo(String value) {
            addCriterion("forlangproficiency =", value, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyNotEqualTo(String value) {
            addCriterion("forlangproficiency <>", value, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyGreaterThan(String value) {
            addCriterion("forlangproficiency >", value, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyGreaterThanOrEqualTo(String value) {
            addCriterion("forlangproficiency >=", value, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyLessThan(String value) {
            addCriterion("forlangproficiency <", value, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyLessThanOrEqualTo(String value) {
            addCriterion("forlangproficiency <=", value, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyLike(String value) {
            addCriterion("forlangproficiency like", value, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyNotLike(String value) {
            addCriterion("forlangproficiency not like", value, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyIn(List<String> values) {
            addCriterion("forlangproficiency in", values, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyNotIn(List<String> values) {
            addCriterion("forlangproficiency not in", values, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyBetween(String value1, String value2) {
            addCriterion("forlangproficiency between", value1, value2, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andForlangproficiencyNotBetween(String value1, String value2) {
            addCriterion("forlangproficiency not between", value1, value2, "forlangproficiency");
            return (Criteria) this;
        }

        public Criteria andComputerlevelIsNull() {
            addCriterion("computerlevel is null");
            return (Criteria) this;
        }

        public Criteria andComputerlevelIsNotNull() {
            addCriterion("computerlevel is not null");
            return (Criteria) this;
        }

        public Criteria andComputerlevelEqualTo(String value) {
            addCriterion("computerlevel =", value, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelNotEqualTo(String value) {
            addCriterion("computerlevel <>", value, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelGreaterThan(String value) {
            addCriterion("computerlevel >", value, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelGreaterThanOrEqualTo(String value) {
            addCriterion("computerlevel >=", value, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelLessThan(String value) {
            addCriterion("computerlevel <", value, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelLessThanOrEqualTo(String value) {
            addCriterion("computerlevel <=", value, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelLike(String value) {
            addCriterion("computerlevel like", value, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelNotLike(String value) {
            addCriterion("computerlevel not like", value, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelIn(List<String> values) {
            addCriterion("computerlevel in", values, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelNotIn(List<String> values) {
            addCriterion("computerlevel not in", values, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelBetween(String value1, String value2) {
            addCriterion("computerlevel between", value1, value2, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andComputerlevelNotBetween(String value1, String value2) {
            addCriterion("computerlevel not between", value1, value2, "computerlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelIsNull() {
            addCriterion("mandarinlevel is null");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelIsNotNull() {
            addCriterion("mandarinlevel is not null");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelEqualTo(String value) {
            addCriterion("mandarinlevel =", value, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelNotEqualTo(String value) {
            addCriterion("mandarinlevel <>", value, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelGreaterThan(String value) {
            addCriterion("mandarinlevel >", value, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelGreaterThanOrEqualTo(String value) {
            addCriterion("mandarinlevel >=", value, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelLessThan(String value) {
            addCriterion("mandarinlevel <", value, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelLessThanOrEqualTo(String value) {
            addCriterion("mandarinlevel <=", value, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelLike(String value) {
            addCriterion("mandarinlevel like", value, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelNotLike(String value) {
            addCriterion("mandarinlevel not like", value, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelIn(List<String> values) {
            addCriterion("mandarinlevel in", values, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelNotIn(List<String> values) {
            addCriterion("mandarinlevel not in", values, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelBetween(String value1, String value2) {
            addCriterion("mandarinlevel between", value1, value2, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andMandarinlevelNotBetween(String value1, String value2) {
            addCriterion("mandarinlevel not between", value1, value2, "mandarinlevel");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationIsNull() {
            addCriterion("expectjoblocation is null");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationIsNotNull() {
            addCriterion("expectjoblocation is not null");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationEqualTo(String value) {
            addCriterion("expectjoblocation =", value, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationNotEqualTo(String value) {
            addCriterion("expectjoblocation <>", value, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationGreaterThan(String value) {
            addCriterion("expectjoblocation >", value, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationGreaterThanOrEqualTo(String value) {
            addCriterion("expectjoblocation >=", value, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationLessThan(String value) {
            addCriterion("expectjoblocation <", value, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationLessThanOrEqualTo(String value) {
            addCriterion("expectjoblocation <=", value, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationLike(String value) {
            addCriterion("expectjoblocation like", value, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationNotLike(String value) {
            addCriterion("expectjoblocation not like", value, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationIn(List<String> values) {
            addCriterion("expectjoblocation in", values, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationNotIn(List<String> values) {
            addCriterion("expectjoblocation not in", values, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationBetween(String value1, String value2) {
            addCriterion("expectjoblocation between", value1, value2, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjoblocationNotBetween(String value1, String value2) {
            addCriterion("expectjoblocation not between", value1, value2, "expectjoblocation");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostIsNull() {
            addCriterion("expectjobpost is null");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostIsNotNull() {
            addCriterion("expectjobpost is not null");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostEqualTo(String value) {
            addCriterion("expectjobpost =", value, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostNotEqualTo(String value) {
            addCriterion("expectjobpost <>", value, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostGreaterThan(String value) {
            addCriterion("expectjobpost >", value, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostGreaterThanOrEqualTo(String value) {
            addCriterion("expectjobpost >=", value, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostLessThan(String value) {
            addCriterion("expectjobpost <", value, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostLessThanOrEqualTo(String value) {
            addCriterion("expectjobpost <=", value, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostLike(String value) {
            addCriterion("expectjobpost like", value, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostNotLike(String value) {
            addCriterion("expectjobpost not like", value, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostIn(List<String> values) {
            addCriterion("expectjobpost in", values, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostNotIn(List<String> values) {
            addCriterion("expectjobpost not in", values, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostBetween(String value1, String value2) {
            addCriterion("expectjobpost between", value1, value2, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectjobpostNotBetween(String value1, String value2) {
            addCriterion("expectjobpost not between", value1, value2, "expectjobpost");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryIsNull() {
            addCriterion("expectsalary is null");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryIsNotNull() {
            addCriterion("expectsalary is not null");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryEqualTo(String value) {
            addCriterion("expectsalary =", value, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryNotEqualTo(String value) {
            addCriterion("expectsalary <>", value, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryGreaterThan(String value) {
            addCriterion("expectsalary >", value, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryGreaterThanOrEqualTo(String value) {
            addCriterion("expectsalary >=", value, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryLessThan(String value) {
            addCriterion("expectsalary <", value, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryLessThanOrEqualTo(String value) {
            addCriterion("expectsalary <=", value, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryLike(String value) {
            addCriterion("expectsalary like", value, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryNotLike(String value) {
            addCriterion("expectsalary not like", value, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryIn(List<String> values) {
            addCriterion("expectsalary in", values, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryNotIn(List<String> values) {
            addCriterion("expectsalary not in", values, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryBetween(String value1, String value2) {
            addCriterion("expectsalary between", value1, value2, "expectsalary");
            return (Criteria) this;
        }

        public Criteria andExpectsalaryNotBetween(String value1, String value2) {
            addCriterion("expectsalary not between", value1, value2, "expectsalary");
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

        public Criteria andPicturepathIsNull() {
            addCriterion("picturepath is null");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNotNull() {
            addCriterion("picturepath is not null");
            return (Criteria) this;
        }

        public Criteria andPicturepathEqualTo(String value) {
            addCriterion("picturepath =", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotEqualTo(String value) {
            addCriterion("picturepath <>", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThan(String value) {
            addCriterion("picturepath >", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThanOrEqualTo(String value) {
            addCriterion("picturepath >=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThan(String value) {
            addCriterion("picturepath <", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThanOrEqualTo(String value) {
            addCriterion("picturepath <=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLike(String value) {
            addCriterion("picturepath like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotLike(String value) {
            addCriterion("picturepath not like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathIn(List<String> values) {
            addCriterion("picturepath in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotIn(List<String> values) {
            addCriterion("picturepath not in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathBetween(String value1, String value2) {
            addCriterion("picturepath between", value1, value2, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotBetween(String value1, String value2) {
            addCriterion("picturepath not between", value1, value2, "picturepath");
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