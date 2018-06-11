package com.hanhan.utils0002.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrdtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrdtExample() {
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

        public Criteria andPrdNoIsNull() {
            addCriterion("PRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andPrdNoIsNotNull() {
            addCriterion("PRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNoEqualTo(String value) {
            addCriterion("PRD_NO =", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotEqualTo(String value) {
            addCriterion("PRD_NO <>", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThan(String value) {
            addCriterion("PRD_NO >", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NO >=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThan(String value) {
            addCriterion("PRD_NO <", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThanOrEqualTo(String value) {
            addCriterion("PRD_NO <=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLike(String value) {
            addCriterion("PRD_NO like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotLike(String value) {
            addCriterion("PRD_NO not like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoIn(List<String> values) {
            addCriterion("PRD_NO in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotIn(List<String> values) {
            addCriterion("PRD_NO not in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoBetween(String value1, String value2) {
            addCriterion("PRD_NO between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotBetween(String value1, String value2) {
            addCriterion("PRD_NO not between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andSnmIsNull() {
            addCriterion("SNM is null");
            return (Criteria) this;
        }

        public Criteria andSnmIsNotNull() {
            addCriterion("SNM is not null");
            return (Criteria) this;
        }

        public Criteria andSnmEqualTo(String value) {
            addCriterion("SNM =", value, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmNotEqualTo(String value) {
            addCriterion("SNM <>", value, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmGreaterThan(String value) {
            addCriterion("SNM >", value, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmGreaterThanOrEqualTo(String value) {
            addCriterion("SNM >=", value, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmLessThan(String value) {
            addCriterion("SNM <", value, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmLessThanOrEqualTo(String value) {
            addCriterion("SNM <=", value, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmLike(String value) {
            addCriterion("SNM like", value, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmNotLike(String value) {
            addCriterion("SNM not like", value, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmIn(List<String> values) {
            addCriterion("SNM in", values, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmNotIn(List<String> values) {
            addCriterion("SNM not in", values, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmBetween(String value1, String value2) {
            addCriterion("SNM between", value1, value2, "snm");
            return (Criteria) this;
        }

        public Criteria andSnmNotBetween(String value1, String value2) {
            addCriterion("SNM not between", value1, value2, "snm");
            return (Criteria) this;
        }

        public Criteria andIdx1IsNull() {
            addCriterion("IDX1 is null");
            return (Criteria) this;
        }

        public Criteria andIdx1IsNotNull() {
            addCriterion("IDX1 is not null");
            return (Criteria) this;
        }

        public Criteria andIdx1EqualTo(String value) {
            addCriterion("IDX1 =", value, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1NotEqualTo(String value) {
            addCriterion("IDX1 <>", value, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1GreaterThan(String value) {
            addCriterion("IDX1 >", value, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1GreaterThanOrEqualTo(String value) {
            addCriterion("IDX1 >=", value, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1LessThan(String value) {
            addCriterion("IDX1 <", value, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1LessThanOrEqualTo(String value) {
            addCriterion("IDX1 <=", value, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1Like(String value) {
            addCriterion("IDX1 like", value, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1NotLike(String value) {
            addCriterion("IDX1 not like", value, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1In(List<String> values) {
            addCriterion("IDX1 in", values, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1NotIn(List<String> values) {
            addCriterion("IDX1 not in", values, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1Between(String value1, String value2) {
            addCriterion("IDX1 between", value1, value2, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx1NotBetween(String value1, String value2) {
            addCriterion("IDX1 not between", value1, value2, "idx1");
            return (Criteria) this;
        }

        public Criteria andIdx2IsNull() {
            addCriterion("IDX2 is null");
            return (Criteria) this;
        }

        public Criteria andIdx2IsNotNull() {
            addCriterion("IDX2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdx2EqualTo(String value) {
            addCriterion("IDX2 =", value, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2NotEqualTo(String value) {
            addCriterion("IDX2 <>", value, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2GreaterThan(String value) {
            addCriterion("IDX2 >", value, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2GreaterThanOrEqualTo(String value) {
            addCriterion("IDX2 >=", value, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2LessThan(String value) {
            addCriterion("IDX2 <", value, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2LessThanOrEqualTo(String value) {
            addCriterion("IDX2 <=", value, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2Like(String value) {
            addCriterion("IDX2 like", value, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2NotLike(String value) {
            addCriterion("IDX2 not like", value, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2In(List<String> values) {
            addCriterion("IDX2 in", values, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2NotIn(List<String> values) {
            addCriterion("IDX2 not in", values, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2Between(String value1, String value2) {
            addCriterion("IDX2 between", value1, value2, "idx2");
            return (Criteria) this;
        }

        public Criteria andIdx2NotBetween(String value1, String value2) {
            addCriterion("IDX2 not between", value1, value2, "idx2");
            return (Criteria) this;
        }

        public Criteria andUtIsNull() {
            addCriterion("UT is null");
            return (Criteria) this;
        }

        public Criteria andUtIsNotNull() {
            addCriterion("UT is not null");
            return (Criteria) this;
        }

        public Criteria andUtEqualTo(String value) {
            addCriterion("UT =", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtNotEqualTo(String value) {
            addCriterion("UT <>", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtGreaterThan(String value) {
            addCriterion("UT >", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtGreaterThanOrEqualTo(String value) {
            addCriterion("UT >=", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtLessThan(String value) {
            addCriterion("UT <", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtLessThanOrEqualTo(String value) {
            addCriterion("UT <=", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtLike(String value) {
            addCriterion("UT like", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtNotLike(String value) {
            addCriterion("UT not like", value, "ut");
            return (Criteria) this;
        }

        public Criteria andUtIn(List<String> values) {
            addCriterion("UT in", values, "ut");
            return (Criteria) this;
        }

        public Criteria andUtNotIn(List<String> values) {
            addCriterion("UT not in", values, "ut");
            return (Criteria) this;
        }

        public Criteria andUtBetween(String value1, String value2) {
            addCriterion("UT between", value1, value2, "ut");
            return (Criteria) this;
        }

        public Criteria andUtNotBetween(String value1, String value2) {
            addCriterion("UT not between", value1, value2, "ut");
            return (Criteria) this;
        }

        public Criteria andUt1IsNull() {
            addCriterion("UT1 is null");
            return (Criteria) this;
        }

        public Criteria andUt1IsNotNull() {
            addCriterion("UT1 is not null");
            return (Criteria) this;
        }

        public Criteria andUt1EqualTo(String value) {
            addCriterion("UT1 =", value, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1NotEqualTo(String value) {
            addCriterion("UT1 <>", value, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1GreaterThan(String value) {
            addCriterion("UT1 >", value, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1GreaterThanOrEqualTo(String value) {
            addCriterion("UT1 >=", value, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1LessThan(String value) {
            addCriterion("UT1 <", value, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1LessThanOrEqualTo(String value) {
            addCriterion("UT1 <=", value, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1Like(String value) {
            addCriterion("UT1 like", value, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1NotLike(String value) {
            addCriterion("UT1 not like", value, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1In(List<String> values) {
            addCriterion("UT1 in", values, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1NotIn(List<String> values) {
            addCriterion("UT1 not in", values, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1Between(String value1, String value2) {
            addCriterion("UT1 between", value1, value2, "ut1");
            return (Criteria) this;
        }

        public Criteria andUt1NotBetween(String value1, String value2) {
            addCriterion("UT1 not between", value1, value2, "ut1");
            return (Criteria) this;
        }

        public Criteria andDfuUtIsNull() {
            addCriterion("DFU_UT is null");
            return (Criteria) this;
        }

        public Criteria andDfuUtIsNotNull() {
            addCriterion("DFU_UT is not null");
            return (Criteria) this;
        }

        public Criteria andDfuUtEqualTo(String value) {
            addCriterion("DFU_UT =", value, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtNotEqualTo(String value) {
            addCriterion("DFU_UT <>", value, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtGreaterThan(String value) {
            addCriterion("DFU_UT >", value, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtGreaterThanOrEqualTo(String value) {
            addCriterion("DFU_UT >=", value, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtLessThan(String value) {
            addCriterion("DFU_UT <", value, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtLessThanOrEqualTo(String value) {
            addCriterion("DFU_UT <=", value, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtLike(String value) {
            addCriterion("DFU_UT like", value, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtNotLike(String value) {
            addCriterion("DFU_UT not like", value, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtIn(List<String> values) {
            addCriterion("DFU_UT in", values, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtNotIn(List<String> values) {
            addCriterion("DFU_UT not in", values, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtBetween(String value1, String value2) {
            addCriterion("DFU_UT between", value1, value2, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andDfuUtNotBetween(String value1, String value2) {
            addCriterion("DFU_UT not between", value1, value2, "dfuUt");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCccIsNull() {
            addCriterion("CCC is null");
            return (Criteria) this;
        }

        public Criteria andCccIsNotNull() {
            addCriterion("CCC is not null");
            return (Criteria) this;
        }

        public Criteria andCccEqualTo(String value) {
            addCriterion("CCC =", value, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccNotEqualTo(String value) {
            addCriterion("CCC <>", value, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccGreaterThan(String value) {
            addCriterion("CCC >", value, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccGreaterThanOrEqualTo(String value) {
            addCriterion("CCC >=", value, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccLessThan(String value) {
            addCriterion("CCC <", value, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccLessThanOrEqualTo(String value) {
            addCriterion("CCC <=", value, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccLike(String value) {
            addCriterion("CCC like", value, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccNotLike(String value) {
            addCriterion("CCC not like", value, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccIn(List<String> values) {
            addCriterion("CCC in", values, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccNotIn(List<String> values) {
            addCriterion("CCC not in", values, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccBetween(String value1, String value2) {
            addCriterion("CCC between", value1, value2, "ccc");
            return (Criteria) this;
        }

        public Criteria andCccNotBetween(String value1, String value2) {
            addCriterion("CCC not between", value1, value2, "ccc");
            return (Criteria) this;
        }

        public Criteria andKndIsNull() {
            addCriterion("KND is null");
            return (Criteria) this;
        }

        public Criteria andKndIsNotNull() {
            addCriterion("KND is not null");
            return (Criteria) this;
        }

        public Criteria andKndEqualTo(String value) {
            addCriterion("KND =", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndNotEqualTo(String value) {
            addCriterion("KND <>", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndGreaterThan(String value) {
            addCriterion("KND >", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndGreaterThanOrEqualTo(String value) {
            addCriterion("KND >=", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndLessThan(String value) {
            addCriterion("KND <", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndLessThanOrEqualTo(String value) {
            addCriterion("KND <=", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndLike(String value) {
            addCriterion("KND like", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndNotLike(String value) {
            addCriterion("KND not like", value, "knd");
            return (Criteria) this;
        }

        public Criteria andKndIn(List<String> values) {
            addCriterion("KND in", values, "knd");
            return (Criteria) this;
        }

        public Criteria andKndNotIn(List<String> values) {
            addCriterion("KND not in", values, "knd");
            return (Criteria) this;
        }

        public Criteria andKndBetween(String value1, String value2) {
            addCriterion("KND between", value1, value2, "knd");
            return (Criteria) this;
        }

        public Criteria andKndNotBetween(String value1, String value2) {
            addCriterion("KND not between", value1, value2, "knd");
            return (Criteria) this;
        }

        public Criteria andSpcTaxIsNull() {
            addCriterion("SPC_TAX is null");
            return (Criteria) this;
        }

        public Criteria andSpcTaxIsNotNull() {
            addCriterion("SPC_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andSpcTaxEqualTo(Double value) {
            addCriterion("SPC_TAX =", value, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxNotEqualTo(Double value) {
            addCriterion("SPC_TAX <>", value, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxGreaterThan(Double value) {
            addCriterion("SPC_TAX >", value, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("SPC_TAX >=", value, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxLessThan(Double value) {
            addCriterion("SPC_TAX <", value, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxLessThanOrEqualTo(Double value) {
            addCriterion("SPC_TAX <=", value, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxIn(List<Double> values) {
            addCriterion("SPC_TAX in", values, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxNotIn(List<Double> values) {
            addCriterion("SPC_TAX not in", values, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxBetween(Double value1, Double value2) {
            addCriterion("SPC_TAX between", value1, value2, "spcTax");
            return (Criteria) this;
        }

        public Criteria andSpcTaxNotBetween(Double value1, Double value2) {
            addCriterion("SPC_TAX not between", value1, value2, "spcTax");
            return (Criteria) this;
        }

        public Criteria andPk2UtIsNull() {
            addCriterion("PK2_UT is null");
            return (Criteria) this;
        }

        public Criteria andPk2UtIsNotNull() {
            addCriterion("PK2_UT is not null");
            return (Criteria) this;
        }

        public Criteria andPk2UtEqualTo(String value) {
            addCriterion("PK2_UT =", value, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtNotEqualTo(String value) {
            addCriterion("PK2_UT <>", value, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtGreaterThan(String value) {
            addCriterion("PK2_UT >", value, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtGreaterThanOrEqualTo(String value) {
            addCriterion("PK2_UT >=", value, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtLessThan(String value) {
            addCriterion("PK2_UT <", value, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtLessThanOrEqualTo(String value) {
            addCriterion("PK2_UT <=", value, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtLike(String value) {
            addCriterion("PK2_UT like", value, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtNotLike(String value) {
            addCriterion("PK2_UT not like", value, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtIn(List<String> values) {
            addCriterion("PK2_UT in", values, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtNotIn(List<String> values) {
            addCriterion("PK2_UT not in", values, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtBetween(String value1, String value2) {
            addCriterion("PK2_UT between", value1, value2, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2UtNotBetween(String value1, String value2) {
            addCriterion("PK2_UT not between", value1, value2, "pk2Ut");
            return (Criteria) this;
        }

        public Criteria andPk2QtyIsNull() {
            addCriterion("PK2_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPk2QtyIsNotNull() {
            addCriterion("PK2_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPk2QtyEqualTo(Double value) {
            addCriterion("PK2_QTY =", value, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyNotEqualTo(Double value) {
            addCriterion("PK2_QTY <>", value, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyGreaterThan(Double value) {
            addCriterion("PK2_QTY >", value, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyGreaterThanOrEqualTo(Double value) {
            addCriterion("PK2_QTY >=", value, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyLessThan(Double value) {
            addCriterion("PK2_QTY <", value, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyLessThanOrEqualTo(Double value) {
            addCriterion("PK2_QTY <=", value, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyIn(List<Double> values) {
            addCriterion("PK2_QTY in", values, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyNotIn(List<Double> values) {
            addCriterion("PK2_QTY not in", values, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyBetween(Double value1, Double value2) {
            addCriterion("PK2_QTY between", value1, value2, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk2QtyNotBetween(Double value1, Double value2) {
            addCriterion("PK2_QTY not between", value1, value2, "pk2Qty");
            return (Criteria) this;
        }

        public Criteria andPk3UtIsNull() {
            addCriterion("PK3_UT is null");
            return (Criteria) this;
        }

        public Criteria andPk3UtIsNotNull() {
            addCriterion("PK3_UT is not null");
            return (Criteria) this;
        }

        public Criteria andPk3UtEqualTo(String value) {
            addCriterion("PK3_UT =", value, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtNotEqualTo(String value) {
            addCriterion("PK3_UT <>", value, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtGreaterThan(String value) {
            addCriterion("PK3_UT >", value, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtGreaterThanOrEqualTo(String value) {
            addCriterion("PK3_UT >=", value, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtLessThan(String value) {
            addCriterion("PK3_UT <", value, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtLessThanOrEqualTo(String value) {
            addCriterion("PK3_UT <=", value, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtLike(String value) {
            addCriterion("PK3_UT like", value, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtNotLike(String value) {
            addCriterion("PK3_UT not like", value, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtIn(List<String> values) {
            addCriterion("PK3_UT in", values, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtNotIn(List<String> values) {
            addCriterion("PK3_UT not in", values, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtBetween(String value1, String value2) {
            addCriterion("PK3_UT between", value1, value2, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3UtNotBetween(String value1, String value2) {
            addCriterion("PK3_UT not between", value1, value2, "pk3Ut");
            return (Criteria) this;
        }

        public Criteria andPk3QtyIsNull() {
            addCriterion("PK3_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPk3QtyIsNotNull() {
            addCriterion("PK3_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPk3QtyEqualTo(Double value) {
            addCriterion("PK3_QTY =", value, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyNotEqualTo(Double value) {
            addCriterion("PK3_QTY <>", value, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyGreaterThan(Double value) {
            addCriterion("PK3_QTY >", value, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyGreaterThanOrEqualTo(Double value) {
            addCriterion("PK3_QTY >=", value, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyLessThan(Double value) {
            addCriterion("PK3_QTY <", value, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyLessThanOrEqualTo(Double value) {
            addCriterion("PK3_QTY <=", value, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyIn(List<Double> values) {
            addCriterion("PK3_QTY in", values, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyNotIn(List<Double> values) {
            addCriterion("PK3_QTY not in", values, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyBetween(Double value1, Double value2) {
            addCriterion("PK3_QTY between", value1, value2, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andPk3QtyNotBetween(Double value1, Double value2) {
            addCriterion("PK3_QTY not between", value1, value2, "pk3Qty");
            return (Criteria) this;
        }

        public Criteria andMrkIsNull() {
            addCriterion("MRK is null");
            return (Criteria) this;
        }

        public Criteria andMrkIsNotNull() {
            addCriterion("MRK is not null");
            return (Criteria) this;
        }

        public Criteria andMrkEqualTo(String value) {
            addCriterion("MRK =", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkNotEqualTo(String value) {
            addCriterion("MRK <>", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkGreaterThan(String value) {
            addCriterion("MRK >", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkGreaterThanOrEqualTo(String value) {
            addCriterion("MRK >=", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkLessThan(String value) {
            addCriterion("MRK <", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkLessThanOrEqualTo(String value) {
            addCriterion("MRK <=", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkLike(String value) {
            addCriterion("MRK like", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkNotLike(String value) {
            addCriterion("MRK not like", value, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkIn(List<String> values) {
            addCriterion("MRK in", values, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkNotIn(List<String> values) {
            addCriterion("MRK not in", values, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkBetween(String value1, String value2) {
            addCriterion("MRK between", value1, value2, "mrk");
            return (Criteria) this;
        }

        public Criteria andMrkNotBetween(String value1, String value2) {
            addCriterion("MRK not between", value1, value2, "mrk");
            return (Criteria) this;
        }

        public Criteria andSup1IsNull() {
            addCriterion("SUP1 is null");
            return (Criteria) this;
        }

        public Criteria andSup1IsNotNull() {
            addCriterion("SUP1 is not null");
            return (Criteria) this;
        }

        public Criteria andSup1EqualTo(String value) {
            addCriterion("SUP1 =", value, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1NotEqualTo(String value) {
            addCriterion("SUP1 <>", value, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1GreaterThan(String value) {
            addCriterion("SUP1 >", value, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1GreaterThanOrEqualTo(String value) {
            addCriterion("SUP1 >=", value, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1LessThan(String value) {
            addCriterion("SUP1 <", value, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1LessThanOrEqualTo(String value) {
            addCriterion("SUP1 <=", value, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1Like(String value) {
            addCriterion("SUP1 like", value, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1NotLike(String value) {
            addCriterion("SUP1 not like", value, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1In(List<String> values) {
            addCriterion("SUP1 in", values, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1NotIn(List<String> values) {
            addCriterion("SUP1 not in", values, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1Between(String value1, String value2) {
            addCriterion("SUP1 between", value1, value2, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup1NotBetween(String value1, String value2) {
            addCriterion("SUP1 not between", value1, value2, "sup1");
            return (Criteria) this;
        }

        public Criteria andSup2IsNull() {
            addCriterion("SUP2 is null");
            return (Criteria) this;
        }

        public Criteria andSup2IsNotNull() {
            addCriterion("SUP2 is not null");
            return (Criteria) this;
        }

        public Criteria andSup2EqualTo(String value) {
            addCriterion("SUP2 =", value, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2NotEqualTo(String value) {
            addCriterion("SUP2 <>", value, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2GreaterThan(String value) {
            addCriterion("SUP2 >", value, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2GreaterThanOrEqualTo(String value) {
            addCriterion("SUP2 >=", value, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2LessThan(String value) {
            addCriterion("SUP2 <", value, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2LessThanOrEqualTo(String value) {
            addCriterion("SUP2 <=", value, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2Like(String value) {
            addCriterion("SUP2 like", value, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2NotLike(String value) {
            addCriterion("SUP2 not like", value, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2In(List<String> values) {
            addCriterion("SUP2 in", values, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2NotIn(List<String> values) {
            addCriterion("SUP2 not in", values, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2Between(String value1, String value2) {
            addCriterion("SUP2 between", value1, value2, "sup2");
            return (Criteria) this;
        }

        public Criteria andSup2NotBetween(String value1, String value2) {
            addCriterion("SUP2 not between", value1, value2, "sup2");
            return (Criteria) this;
        }

        public Criteria andUprIsNull() {
            addCriterion("UPR is null");
            return (Criteria) this;
        }

        public Criteria andUprIsNotNull() {
            addCriterion("UPR is not null");
            return (Criteria) this;
        }

        public Criteria andUprEqualTo(BigDecimal value) {
            addCriterion("UPR =", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprNotEqualTo(BigDecimal value) {
            addCriterion("UPR <>", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprGreaterThan(BigDecimal value) {
            addCriterion("UPR >", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR >=", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprLessThan(BigDecimal value) {
            addCriterion("UPR <", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR <=", value, "upr");
            return (Criteria) this;
        }

        public Criteria andUprIn(List<BigDecimal> values) {
            addCriterion("UPR in", values, "upr");
            return (Criteria) this;
        }

        public Criteria andUprNotIn(List<BigDecimal> values) {
            addCriterion("UPR not in", values, "upr");
            return (Criteria) this;
        }

        public Criteria andUprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR between", value1, value2, "upr");
            return (Criteria) this;
        }

        public Criteria andUprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR not between", value1, value2, "upr");
            return (Criteria) this;
        }

        public Criteria andUbprIsNull() {
            addCriterion("UBPR is null");
            return (Criteria) this;
        }

        public Criteria andUbprIsNotNull() {
            addCriterion("UBPR is not null");
            return (Criteria) this;
        }

        public Criteria andUbprEqualTo(Integer value) {
            addCriterion("UBPR =", value, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprNotEqualTo(Integer value) {
            addCriterion("UBPR <>", value, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprGreaterThan(Integer value) {
            addCriterion("UBPR >", value, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprGreaterThanOrEqualTo(Integer value) {
            addCriterion("UBPR >=", value, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprLessThan(Integer value) {
            addCriterion("UBPR <", value, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprLessThanOrEqualTo(Integer value) {
            addCriterion("UBPR <=", value, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprIn(List<Integer> values) {
            addCriterion("UBPR in", values, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprNotIn(List<Integer> values) {
            addCriterion("UBPR not in", values, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprBetween(Integer value1, Integer value2) {
            addCriterion("UBPR between", value1, value2, "ubpr");
            return (Criteria) this;
        }

        public Criteria andUbprNotBetween(Integer value1, Integer value2) {
            addCriterion("UBPR not between", value1, value2, "ubpr");
            return (Criteria) this;
        }

        public Criteria andCstStdIsNull() {
            addCriterion("CST_STD is null");
            return (Criteria) this;
        }

        public Criteria andCstStdIsNotNull() {
            addCriterion("CST_STD is not null");
            return (Criteria) this;
        }

        public Criteria andCstStdEqualTo(BigDecimal value) {
            addCriterion("CST_STD =", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotEqualTo(BigDecimal value) {
            addCriterion("CST_STD <>", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdGreaterThan(BigDecimal value) {
            addCriterion("CST_STD >", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD >=", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdLessThan(BigDecimal value) {
            addCriterion("CST_STD <", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD <=", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdIn(List<BigDecimal> values) {
            addCriterion("CST_STD in", values, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotIn(List<BigDecimal> values) {
            addCriterion("CST_STD not in", values, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD between", value1, value2, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD not between", value1, value2, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstSalIsNull() {
            addCriterion("CST_SAL is null");
            return (Criteria) this;
        }

        public Criteria andCstSalIsNotNull() {
            addCriterion("CST_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andCstSalEqualTo(BigDecimal value) {
            addCriterion("CST_SAL =", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalNotEqualTo(BigDecimal value) {
            addCriterion("CST_SAL <>", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalGreaterThan(BigDecimal value) {
            addCriterion("CST_SAL >", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_SAL >=", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalLessThan(BigDecimal value) {
            addCriterion("CST_SAL <", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_SAL <=", value, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalIn(List<BigDecimal> values) {
            addCriterion("CST_SAL in", values, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalNotIn(List<BigDecimal> values) {
            addCriterion("CST_SAL not in", values, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_SAL between", value1, value2, "cstSal");
            return (Criteria) this;
        }

        public Criteria andCstSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_SAL not between", value1, value2, "cstSal");
            return (Criteria) this;
        }

        public Criteria andSpcPrdIsNull() {
            addCriterion("SPC_PRD is null");
            return (Criteria) this;
        }

        public Criteria andSpcPrdIsNotNull() {
            addCriterion("SPC_PRD is not null");
            return (Criteria) this;
        }

        public Criteria andSpcPrdEqualTo(String value) {
            addCriterion("SPC_PRD =", value, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdNotEqualTo(String value) {
            addCriterion("SPC_PRD <>", value, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdGreaterThan(String value) {
            addCriterion("SPC_PRD >", value, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdGreaterThanOrEqualTo(String value) {
            addCriterion("SPC_PRD >=", value, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdLessThan(String value) {
            addCriterion("SPC_PRD <", value, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdLessThanOrEqualTo(String value) {
            addCriterion("SPC_PRD <=", value, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdLike(String value) {
            addCriterion("SPC_PRD like", value, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdNotLike(String value) {
            addCriterion("SPC_PRD not like", value, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdIn(List<String> values) {
            addCriterion("SPC_PRD in", values, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdNotIn(List<String> values) {
            addCriterion("SPC_PRD not in", values, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdBetween(String value1, String value2) {
            addCriterion("SPC_PRD between", value1, value2, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andSpcPrdNotBetween(String value1, String value2) {
            addCriterion("SPC_PRD not between", value1, value2, "spcPrd");
            return (Criteria) this;
        }

        public Criteria andUprLevel1IsNull() {
            addCriterion("UPR_LEVEL1 is null");
            return (Criteria) this;
        }

        public Criteria andUprLevel1IsNotNull() {
            addCriterion("UPR_LEVEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andUprLevel1EqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL1 =", value, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1NotEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL1 <>", value, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1GreaterThan(BigDecimal value) {
            addCriterion("UPR_LEVEL1 >", value, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL1 >=", value, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1LessThan(BigDecimal value) {
            addCriterion("UPR_LEVEL1 <", value, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL1 <=", value, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1In(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL1 in", values, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1NotIn(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL1 not in", values, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL1 between", value1, value2, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL1 not between", value1, value2, "uprLevel1");
            return (Criteria) this;
        }

        public Criteria andUprLevel2IsNull() {
            addCriterion("UPR_LEVEL2 is null");
            return (Criteria) this;
        }

        public Criteria andUprLevel2IsNotNull() {
            addCriterion("UPR_LEVEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andUprLevel2EqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL2 =", value, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2NotEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL2 <>", value, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2GreaterThan(BigDecimal value) {
            addCriterion("UPR_LEVEL2 >", value, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL2 >=", value, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2LessThan(BigDecimal value) {
            addCriterion("UPR_LEVEL2 <", value, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL2 <=", value, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2In(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL2 in", values, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2NotIn(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL2 not in", values, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL2 between", value1, value2, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL2 not between", value1, value2, "uprLevel2");
            return (Criteria) this;
        }

        public Criteria andUprLevel3IsNull() {
            addCriterion("UPR_LEVEL3 is null");
            return (Criteria) this;
        }

        public Criteria andUprLevel3IsNotNull() {
            addCriterion("UPR_LEVEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andUprLevel3EqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL3 =", value, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3NotEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL3 <>", value, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3GreaterThan(BigDecimal value) {
            addCriterion("UPR_LEVEL3 >", value, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL3 >=", value, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3LessThan(BigDecimal value) {
            addCriterion("UPR_LEVEL3 <", value, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL3 <=", value, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3In(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL3 in", values, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3NotIn(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL3 not in", values, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL3 between", value1, value2, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL3 not between", value1, value2, "uprLevel3");
            return (Criteria) this;
        }

        public Criteria andUprLevel4IsNull() {
            addCriterion("UPR_LEVEL4 is null");
            return (Criteria) this;
        }

        public Criteria andUprLevel4IsNotNull() {
            addCriterion("UPR_LEVEL4 is not null");
            return (Criteria) this;
        }

        public Criteria andUprLevel4EqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL4 =", value, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4NotEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL4 <>", value, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4GreaterThan(BigDecimal value) {
            addCriterion("UPR_LEVEL4 >", value, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL4 >=", value, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4LessThan(BigDecimal value) {
            addCriterion("UPR_LEVEL4 <", value, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL4 <=", value, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4In(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL4 in", values, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4NotIn(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL4 not in", values, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL4 between", value1, value2, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL4 not between", value1, value2, "uprLevel4");
            return (Criteria) this;
        }

        public Criteria andUprLevel5IsNull() {
            addCriterion("UPR_LEVEL5 is null");
            return (Criteria) this;
        }

        public Criteria andUprLevel5IsNotNull() {
            addCriterion("UPR_LEVEL5 is not null");
            return (Criteria) this;
        }

        public Criteria andUprLevel5EqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL5 =", value, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5NotEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL5 <>", value, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5GreaterThan(BigDecimal value) {
            addCriterion("UPR_LEVEL5 >", value, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL5 >=", value, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5LessThan(BigDecimal value) {
            addCriterion("UPR_LEVEL5 <", value, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL5 <=", value, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5In(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL5 in", values, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5NotIn(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL5 not in", values, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL5 between", value1, value2, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andUprLevel5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL5 not between", value1, value2, "uprLevel5");
            return (Criteria) this;
        }

        public Criteria andPakUnitIsNull() {
            addCriterion("PAK_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakUnitIsNotNull() {
            addCriterion("PAK_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakUnitEqualTo(String value) {
            addCriterion("PAK_UNIT =", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotEqualTo(String value) {
            addCriterion("PAK_UNIT <>", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitGreaterThan(String value) {
            addCriterion("PAK_UNIT >", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_UNIT >=", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLessThan(String value) {
            addCriterion("PAK_UNIT <", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_UNIT <=", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLike(String value) {
            addCriterion("PAK_UNIT like", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotLike(String value) {
            addCriterion("PAK_UNIT not like", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitIn(List<String> values) {
            addCriterion("PAK_UNIT in", values, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotIn(List<String> values) {
            addCriterion("PAK_UNIT not in", values, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitBetween(String value1, String value2) {
            addCriterion("PAK_UNIT between", value1, value2, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_UNIT not between", value1, value2, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakExcIsNull() {
            addCriterion("PAK_EXC is null");
            return (Criteria) this;
        }

        public Criteria andPakExcIsNotNull() {
            addCriterion("PAK_EXC is not null");
            return (Criteria) this;
        }

        public Criteria andPakExcEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC =", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC <>", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcGreaterThan(BigDecimal value) {
            addCriterion("PAK_EXC >", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC >=", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcLessThan(BigDecimal value) {
            addCriterion("PAK_EXC <", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC <=", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcIn(List<BigDecimal> values) {
            addCriterion("PAK_EXC in", values, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotIn(List<BigDecimal> values) {
            addCriterion("PAK_EXC not in", values, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_EXC between", value1, value2, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_EXC not between", value1, value2, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakNwIsNull() {
            addCriterion("PAK_NW is null");
            return (Criteria) this;
        }

        public Criteria andPakNwIsNotNull() {
            addCriterion("PAK_NW is not null");
            return (Criteria) this;
        }

        public Criteria andPakNwEqualTo(BigDecimal value) {
            addCriterion("PAK_NW =", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotEqualTo(BigDecimal value) {
            addCriterion("PAK_NW <>", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwGreaterThan(BigDecimal value) {
            addCriterion("PAK_NW >", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW >=", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwLessThan(BigDecimal value) {
            addCriterion("PAK_NW <", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW <=", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwIn(List<BigDecimal> values) {
            addCriterion("PAK_NW in", values, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotIn(List<BigDecimal> values) {
            addCriterion("PAK_NW not in", values, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW between", value1, value2, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW not between", value1, value2, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIsNull() {
            addCriterion("PAK_WEIGHT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIsNotNull() {
            addCriterion("PAK_WEIGHT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT =", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT <>", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitGreaterThan(String value) {
            addCriterion("PAK_WEIGHT_UNIT >", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT >=", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLessThan(String value) {
            addCriterion("PAK_WEIGHT_UNIT <", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT <=", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLike(String value) {
            addCriterion("PAK_WEIGHT_UNIT like", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotLike(String value) {
            addCriterion("PAK_WEIGHT_UNIT not like", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIn(List<String> values) {
            addCriterion("PAK_WEIGHT_UNIT in", values, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotIn(List<String> values) {
            addCriterion("PAK_WEIGHT_UNIT not in", values, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitBetween(String value1, String value2) {
            addCriterion("PAK_WEIGHT_UNIT between", value1, value2, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_WEIGHT_UNIT not between", value1, value2, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakGwIsNull() {
            addCriterion("PAK_GW is null");
            return (Criteria) this;
        }

        public Criteria andPakGwIsNotNull() {
            addCriterion("PAK_GW is not null");
            return (Criteria) this;
        }

        public Criteria andPakGwEqualTo(BigDecimal value) {
            addCriterion("PAK_GW =", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotEqualTo(BigDecimal value) {
            addCriterion("PAK_GW <>", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwGreaterThan(BigDecimal value) {
            addCriterion("PAK_GW >", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW >=", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwLessThan(BigDecimal value) {
            addCriterion("PAK_GW <", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW <=", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwIn(List<BigDecimal> values) {
            addCriterion("PAK_GW in", values, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotIn(List<BigDecimal> values) {
            addCriterion("PAK_GW not in", values, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW between", value1, value2, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW not between", value1, value2, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakMeastIsNull() {
            addCriterion("PAK_MEAST is null");
            return (Criteria) this;
        }

        public Criteria andPakMeastIsNotNull() {
            addCriterion("PAK_MEAST is not null");
            return (Criteria) this;
        }

        public Criteria andPakMeastEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST =", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST <>", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastGreaterThan(BigDecimal value) {
            addCriterion("PAK_MEAST >", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST >=", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastLessThan(BigDecimal value) {
            addCriterion("PAK_MEAST <", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST <=", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastIn(List<BigDecimal> values) {
            addCriterion("PAK_MEAST in", values, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotIn(List<BigDecimal> values) {
            addCriterion("PAK_MEAST not in", values, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_MEAST between", value1, value2, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_MEAST not between", value1, value2, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIsNull() {
            addCriterion("PAK_MEAST_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIsNotNull() {
            addCriterion("PAK_MEAST_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT =", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT <>", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitGreaterThan(String value) {
            addCriterion("PAK_MEAST_UNIT >", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT >=", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLessThan(String value) {
            addCriterion("PAK_MEAST_UNIT <", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT <=", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLike(String value) {
            addCriterion("PAK_MEAST_UNIT like", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotLike(String value) {
            addCriterion("PAK_MEAST_UNIT not like", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIn(List<String> values) {
            addCriterion("PAK_MEAST_UNIT in", values, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotIn(List<String> values) {
            addCriterion("PAK_MEAST_UNIT not in", values, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitBetween(String value1, String value2) {
            addCriterion("PAK_MEAST_UNIT between", value1, value2, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_MEAST_UNIT not between", value1, value2, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andStopIdIsNull() {
            addCriterion("STOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andStopIdIsNotNull() {
            addCriterion("STOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStopIdEqualTo(String value) {
            addCriterion("STOP_ID =", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdNotEqualTo(String value) {
            addCriterion("STOP_ID <>", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdGreaterThan(String value) {
            addCriterion("STOP_ID >", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdGreaterThanOrEqualTo(String value) {
            addCriterion("STOP_ID >=", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdLessThan(String value) {
            addCriterion("STOP_ID <", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdLessThanOrEqualTo(String value) {
            addCriterion("STOP_ID <=", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdLike(String value) {
            addCriterion("STOP_ID like", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdNotLike(String value) {
            addCriterion("STOP_ID not like", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdIn(List<String> values) {
            addCriterion("STOP_ID in", values, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdNotIn(List<String> values) {
            addCriterion("STOP_ID not in", values, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdBetween(String value1, String value2) {
            addCriterion("STOP_ID between", value1, value2, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdNotBetween(String value1, String value2) {
            addCriterion("STOP_ID not between", value1, value2, "stopId");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcIsNull() {
            addCriterion("PRD_NO_EXC is null");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcIsNotNull() {
            addCriterion("PRD_NO_EXC is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcEqualTo(String value) {
            addCriterion("PRD_NO_EXC =", value, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcNotEqualTo(String value) {
            addCriterion("PRD_NO_EXC <>", value, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcGreaterThan(String value) {
            addCriterion("PRD_NO_EXC >", value, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NO_EXC >=", value, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcLessThan(String value) {
            addCriterion("PRD_NO_EXC <", value, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcLessThanOrEqualTo(String value) {
            addCriterion("PRD_NO_EXC <=", value, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcLike(String value) {
            addCriterion("PRD_NO_EXC like", value, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcNotLike(String value) {
            addCriterion("PRD_NO_EXC not like", value, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcIn(List<String> values) {
            addCriterion("PRD_NO_EXC in", values, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcNotIn(List<String> values) {
            addCriterion("PRD_NO_EXC not in", values, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcBetween(String value1, String value2) {
            addCriterion("PRD_NO_EXC between", value1, value2, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andPrdNoExcNotBetween(String value1, String value2) {
            addCriterion("PRD_NO_EXC not between", value1, value2, "prdNoExc");
            return (Criteria) this;
        }

        public Criteria andNeedDaysIsNull() {
            addCriterion("NEED_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andNeedDaysIsNotNull() {
            addCriterion("NEED_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andNeedDaysEqualTo(BigDecimal value) {
            addCriterion("NEED_DAYS =", value, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysNotEqualTo(BigDecimal value) {
            addCriterion("NEED_DAYS <>", value, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysGreaterThan(BigDecimal value) {
            addCriterion("NEED_DAYS >", value, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEED_DAYS >=", value, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysLessThan(BigDecimal value) {
            addCriterion("NEED_DAYS <", value, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEED_DAYS <=", value, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysIn(List<BigDecimal> values) {
            addCriterion("NEED_DAYS in", values, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysNotIn(List<BigDecimal> values) {
            addCriterion("NEED_DAYS not in", values, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEED_DAYS between", value1, value2, "needDays");
            return (Criteria) this;
        }

        public Criteria andNeedDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEED_DAYS not between", value1, value2, "needDays");
            return (Criteria) this;
        }

        public Criteria andNouseDdIsNull() {
            addCriterion("NOUSE_DD is null");
            return (Criteria) this;
        }

        public Criteria andNouseDdIsNotNull() {
            addCriterion("NOUSE_DD is not null");
            return (Criteria) this;
        }

        public Criteria andNouseDdEqualTo(Date value) {
            addCriterion("NOUSE_DD =", value, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdNotEqualTo(Date value) {
            addCriterion("NOUSE_DD <>", value, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdGreaterThan(Date value) {
            addCriterion("NOUSE_DD >", value, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdGreaterThanOrEqualTo(Date value) {
            addCriterion("NOUSE_DD >=", value, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdLessThan(Date value) {
            addCriterion("NOUSE_DD <", value, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdLessThanOrEqualTo(Date value) {
            addCriterion("NOUSE_DD <=", value, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdIn(List<Date> values) {
            addCriterion("NOUSE_DD in", values, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdNotIn(List<Date> values) {
            addCriterion("NOUSE_DD not in", values, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdBetween(Date value1, Date value2) {
            addCriterion("NOUSE_DD between", value1, value2, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andNouseDdNotBetween(Date value1, Date value2) {
            addCriterion("NOUSE_DD not between", value1, value2, "nouseDd");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("BAR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("BAR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("BAR_CODE =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("BAR_CODE <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("BAR_CODE >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BAR_CODE >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("BAR_CODE <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("BAR_CODE <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("BAR_CODE like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("BAR_CODE not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("BAR_CODE in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("BAR_CODE not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("BAR_CODE between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("BAR_CODE not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNull() {
            addCriterion("FORMULA is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNotNull() {
            addCriterion("FORMULA is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaEqualTo(String value) {
            addCriterion("FORMULA =", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotEqualTo(String value) {
            addCriterion("FORMULA <>", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThan(String value) {
            addCriterion("FORMULA >", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("FORMULA >=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThan(String value) {
            addCriterion("FORMULA <", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThanOrEqualTo(String value) {
            addCriterion("FORMULA <=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLike(String value) {
            addCriterion("FORMULA like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotLike(String value) {
            addCriterion("FORMULA not like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaIn(List<String> values) {
            addCriterion("FORMULA in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotIn(List<String> values) {
            addCriterion("FORMULA not in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaBetween(String value1, String value2) {
            addCriterion("FORMULA between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotBetween(String value1, String value2) {
            addCriterion("FORMULA not between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andNameEngIsNull() {
            addCriterion("NAME_ENG is null");
            return (Criteria) this;
        }

        public Criteria andNameEngIsNotNull() {
            addCriterion("NAME_ENG is not null");
            return (Criteria) this;
        }

        public Criteria andNameEngEqualTo(String value) {
            addCriterion("NAME_ENG =", value, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngNotEqualTo(String value) {
            addCriterion("NAME_ENG <>", value, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngGreaterThan(String value) {
            addCriterion("NAME_ENG >", value, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_ENG >=", value, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngLessThan(String value) {
            addCriterion("NAME_ENG <", value, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngLessThanOrEqualTo(String value) {
            addCriterion("NAME_ENG <=", value, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngLike(String value) {
            addCriterion("NAME_ENG like", value, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngNotLike(String value) {
            addCriterion("NAME_ENG not like", value, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngIn(List<String> values) {
            addCriterion("NAME_ENG in", values, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngNotIn(List<String> values) {
            addCriterion("NAME_ENG not in", values, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngBetween(String value1, String value2) {
            addCriterion("NAME_ENG between", value1, value2, "nameEng");
            return (Criteria) this;
        }

        public Criteria andNameEngNotBetween(String value1, String value2) {
            addCriterion("NAME_ENG not between", value1, value2, "nameEng");
            return (Criteria) this;
        }

        public Criteria andUtTimeIsNull() {
            addCriterion("UT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUtTimeIsNotNull() {
            addCriterion("UT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUtTimeEqualTo(BigDecimal value) {
            addCriterion("UT_TIME =", value, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeNotEqualTo(BigDecimal value) {
            addCriterion("UT_TIME <>", value, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeGreaterThan(BigDecimal value) {
            addCriterion("UT_TIME >", value, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UT_TIME >=", value, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeLessThan(BigDecimal value) {
            addCriterion("UT_TIME <", value, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UT_TIME <=", value, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeIn(List<BigDecimal> values) {
            addCriterion("UT_TIME in", values, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeNotIn(List<BigDecimal> values) {
            addCriterion("UT_TIME not in", values, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UT_TIME between", value1, value2, "utTime");
            return (Criteria) this;
        }

        public Criteria andUtTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UT_TIME not between", value1, value2, "utTime");
            return (Criteria) this;
        }

        public Criteria andChkBatIsNull() {
            addCriterion("CHK_BAT is null");
            return (Criteria) this;
        }

        public Criteria andChkBatIsNotNull() {
            addCriterion("CHK_BAT is not null");
            return (Criteria) this;
        }

        public Criteria andChkBatEqualTo(String value) {
            addCriterion("CHK_BAT =", value, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatNotEqualTo(String value) {
            addCriterion("CHK_BAT <>", value, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatGreaterThan(String value) {
            addCriterion("CHK_BAT >", value, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_BAT >=", value, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatLessThan(String value) {
            addCriterion("CHK_BAT <", value, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatLessThanOrEqualTo(String value) {
            addCriterion("CHK_BAT <=", value, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatLike(String value) {
            addCriterion("CHK_BAT like", value, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatNotLike(String value) {
            addCriterion("CHK_BAT not like", value, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatIn(List<String> values) {
            addCriterion("CHK_BAT in", values, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatNotIn(List<String> values) {
            addCriterion("CHK_BAT not in", values, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatBetween(String value1, String value2) {
            addCriterion("CHK_BAT between", value1, value2, "chkBat");
            return (Criteria) this;
        }

        public Criteria andChkBatNotBetween(String value1, String value2) {
            addCriterion("CHK_BAT not between", value1, value2, "chkBat");
            return (Criteria) this;
        }

        public Criteria andUpMaxIsNull() {
            addCriterion("UP_MAX is null");
            return (Criteria) this;
        }

        public Criteria andUpMaxIsNotNull() {
            addCriterion("UP_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andUpMaxEqualTo(BigDecimal value) {
            addCriterion("UP_MAX =", value, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAX <>", value, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxGreaterThan(BigDecimal value) {
            addCriterion("UP_MAX >", value, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAX >=", value, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxLessThan(BigDecimal value) {
            addCriterion("UP_MAX <", value, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAX <=", value, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxIn(List<BigDecimal> values) {
            addCriterion("UP_MAX in", values, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAX not in", values, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAX between", value1, value2, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAX not between", value1, value2, "upMax");
            return (Criteria) this;
        }

        public Criteria andUpMinIsNull() {
            addCriterion("UP_MIN is null");
            return (Criteria) this;
        }

        public Criteria andUpMinIsNotNull() {
            addCriterion("UP_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andUpMinEqualTo(BigDecimal value) {
            addCriterion("UP_MIN =", value, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinNotEqualTo(BigDecimal value) {
            addCriterion("UP_MIN <>", value, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinGreaterThan(BigDecimal value) {
            addCriterion("UP_MIN >", value, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MIN >=", value, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinLessThan(BigDecimal value) {
            addCriterion("UP_MIN <", value, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MIN <=", value, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinIn(List<BigDecimal> values) {
            addCriterion("UP_MIN in", values, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinNotIn(List<BigDecimal> values) {
            addCriterion("UP_MIN not in", values, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MIN between", value1, value2, "upMin");
            return (Criteria) this;
        }

        public Criteria andUpMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MIN not between", value1, value2, "upMin");
            return (Criteria) this;
        }

        public Criteria andInvNameIsNull() {
            addCriterion("INV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInvNameIsNotNull() {
            addCriterion("INV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvNameEqualTo(String value) {
            addCriterion("INV_NAME =", value, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameNotEqualTo(String value) {
            addCriterion("INV_NAME <>", value, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameGreaterThan(String value) {
            addCriterion("INV_NAME >", value, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameGreaterThanOrEqualTo(String value) {
            addCriterion("INV_NAME >=", value, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameLessThan(String value) {
            addCriterion("INV_NAME <", value, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameLessThanOrEqualTo(String value) {
            addCriterion("INV_NAME <=", value, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameLike(String value) {
            addCriterion("INV_NAME like", value, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameNotLike(String value) {
            addCriterion("INV_NAME not like", value, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameIn(List<String> values) {
            addCriterion("INV_NAME in", values, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameNotIn(List<String> values) {
            addCriterion("INV_NAME not in", values, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameBetween(String value1, String value2) {
            addCriterion("INV_NAME between", value1, value2, "invName");
            return (Criteria) this;
        }

        public Criteria andInvNameNotBetween(String value1, String value2) {
            addCriterion("INV_NAME not between", value1, value2, "invName");
            return (Criteria) this;
        }

        public Criteria andCstAddIsNull() {
            addCriterion("CST_ADD is null");
            return (Criteria) this;
        }

        public Criteria andCstAddIsNotNull() {
            addCriterion("CST_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andCstAddEqualTo(BigDecimal value) {
            addCriterion("CST_ADD =", value, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddNotEqualTo(BigDecimal value) {
            addCriterion("CST_ADD <>", value, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddGreaterThan(BigDecimal value) {
            addCriterion("CST_ADD >", value, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ADD >=", value, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddLessThan(BigDecimal value) {
            addCriterion("CST_ADD <", value, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_ADD <=", value, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddIn(List<BigDecimal> values) {
            addCriterion("CST_ADD in", values, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddNotIn(List<BigDecimal> values) {
            addCriterion("CST_ADD not in", values, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ADD between", value1, value2, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andCstAddNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_ADD not between", value1, value2, "cstAdd");
            return (Criteria) this;
        }

        public Criteria andRbRateIsNull() {
            addCriterion("RB_RATE is null");
            return (Criteria) this;
        }

        public Criteria andRbRateIsNotNull() {
            addCriterion("RB_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRbRateEqualTo(BigDecimal value) {
            addCriterion("RB_RATE =", value, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateNotEqualTo(BigDecimal value) {
            addCriterion("RB_RATE <>", value, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateGreaterThan(BigDecimal value) {
            addCriterion("RB_RATE >", value, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RB_RATE >=", value, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateLessThan(BigDecimal value) {
            addCriterion("RB_RATE <", value, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RB_RATE <=", value, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateIn(List<BigDecimal> values) {
            addCriterion("RB_RATE in", values, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateNotIn(List<BigDecimal> values) {
            addCriterion("RB_RATE not in", values, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RB_RATE between", value1, value2, "rbRate");
            return (Criteria) this;
        }

        public Criteria andRbRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RB_RATE not between", value1, value2, "rbRate");
            return (Criteria) this;
        }

        public Criteria andQtyLowIsNull() {
            addCriterion("QTY_LOW is null");
            return (Criteria) this;
        }

        public Criteria andQtyLowIsNotNull() {
            addCriterion("QTY_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLowEqualTo(BigDecimal value) {
            addCriterion("QTY_LOW =", value, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOW <>", value, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOW >", value, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOW >=", value, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowLessThan(BigDecimal value) {
            addCriterion("QTY_LOW <", value, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOW <=", value, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowIn(List<BigDecimal> values) {
            addCriterion("QTY_LOW in", values, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOW not in", values, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOW between", value1, value2, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andQtyLowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOW not between", value1, value2, "qtyLow");
            return (Criteria) this;
        }

        public Criteria andBomIdIsNull() {
            addCriterion("BOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andBomIdIsNotNull() {
            addCriterion("BOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBomIdEqualTo(String value) {
            addCriterion("BOM_ID =", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotEqualTo(String value) {
            addCriterion("BOM_ID <>", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdGreaterThan(String value) {
            addCriterion("BOM_ID >", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdGreaterThanOrEqualTo(String value) {
            addCriterion("BOM_ID >=", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLessThan(String value) {
            addCriterion("BOM_ID <", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLessThanOrEqualTo(String value) {
            addCriterion("BOM_ID <=", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdLike(String value) {
            addCriterion("BOM_ID like", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotLike(String value) {
            addCriterion("BOM_ID not like", value, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdIn(List<String> values) {
            addCriterion("BOM_ID in", values, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotIn(List<String> values) {
            addCriterion("BOM_ID not in", values, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdBetween(String value1, String value2) {
            addCriterion("BOM_ID between", value1, value2, "bomId");
            return (Criteria) this;
        }

        public Criteria andBomIdNotBetween(String value1, String value2) {
            addCriterion("BOM_ID not between", value1, value2, "bomId");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNull() {
            addCriterion("TIME_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNotNull() {
            addCriterion("TIME_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitEqualTo(String value) {
            addCriterion("TIME_UNIT =", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotEqualTo(String value) {
            addCriterion("TIME_UNIT <>", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThan(String value) {
            addCriterion("TIME_UNIT >", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_UNIT >=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThan(String value) {
            addCriterion("TIME_UNIT <", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThanOrEqualTo(String value) {
            addCriterion("TIME_UNIT <=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLike(String value) {
            addCriterion("TIME_UNIT like", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotLike(String value) {
            addCriterion("TIME_UNIT not like", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIn(List<String> values) {
            addCriterion("TIME_UNIT in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotIn(List<String> values) {
            addCriterion("TIME_UNIT not in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitBetween(String value1, String value2) {
            addCriterion("TIME_UNIT between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotBetween(String value1, String value2) {
            addCriterion("TIME_UNIT not between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andWhIsNull() {
            addCriterion("WH is null");
            return (Criteria) this;
        }

        public Criteria andWhIsNotNull() {
            addCriterion("WH is not null");
            return (Criteria) this;
        }

        public Criteria andWhEqualTo(String value) {
            addCriterion("WH =", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotEqualTo(String value) {
            addCriterion("WH <>", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThan(String value) {
            addCriterion("WH >", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThanOrEqualTo(String value) {
            addCriterion("WH >=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThan(String value) {
            addCriterion("WH <", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThanOrEqualTo(String value) {
            addCriterion("WH <=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLike(String value) {
            addCriterion("WH like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotLike(String value) {
            addCriterion("WH not like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhIn(List<String> values) {
            addCriterion("WH in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotIn(List<String> values) {
            addCriterion("WH not in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhBetween(String value1, String value2) {
            addCriterion("WH between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotBetween(String value1, String value2) {
            addCriterion("WH not between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andOlefieldIsNull() {
            addCriterion("OLEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andOlefieldIsNotNull() {
            addCriterion("OLEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andOlefieldEqualTo(String value) {
            addCriterion("OLEFIELD =", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotEqualTo(String value) {
            addCriterion("OLEFIELD <>", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldGreaterThan(String value) {
            addCriterion("OLEFIELD >", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldGreaterThanOrEqualTo(String value) {
            addCriterion("OLEFIELD >=", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLessThan(String value) {
            addCriterion("OLEFIELD <", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLessThanOrEqualTo(String value) {
            addCriterion("OLEFIELD <=", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldLike(String value) {
            addCriterion("OLEFIELD like", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotLike(String value) {
            addCriterion("OLEFIELD not like", value, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldIn(List<String> values) {
            addCriterion("OLEFIELD in", values, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotIn(List<String> values) {
            addCriterion("OLEFIELD not in", values, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldBetween(String value1, String value2) {
            addCriterion("OLEFIELD between", value1, value2, "olefield");
            return (Criteria) this;
        }

        public Criteria andOlefieldNotBetween(String value1, String value2) {
            addCriterion("OLEFIELD not between", value1, value2, "olefield");
            return (Criteria) this;
        }

        public Criteria andTwIdIsNull() {
            addCriterion("TW_ID is null");
            return (Criteria) this;
        }

        public Criteria andTwIdIsNotNull() {
            addCriterion("TW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTwIdEqualTo(String value) {
            addCriterion("TW_ID =", value, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdNotEqualTo(String value) {
            addCriterion("TW_ID <>", value, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdGreaterThan(String value) {
            addCriterion("TW_ID >", value, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdGreaterThanOrEqualTo(String value) {
            addCriterion("TW_ID >=", value, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdLessThan(String value) {
            addCriterion("TW_ID <", value, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdLessThanOrEqualTo(String value) {
            addCriterion("TW_ID <=", value, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdLike(String value) {
            addCriterion("TW_ID like", value, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdNotLike(String value) {
            addCriterion("TW_ID not like", value, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdIn(List<String> values) {
            addCriterion("TW_ID in", values, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdNotIn(List<String> values) {
            addCriterion("TW_ID not in", values, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdBetween(String value1, String value2) {
            addCriterion("TW_ID between", value1, value2, "twId");
            return (Criteria) this;
        }

        public Criteria andTwIdNotBetween(String value1, String value2) {
            addCriterion("TW_ID not between", value1, value2, "twId");
            return (Criteria) this;
        }

        public Criteria andWtutIsNull() {
            addCriterion("WTUT is null");
            return (Criteria) this;
        }

        public Criteria andWtutIsNotNull() {
            addCriterion("WTUT is not null");
            return (Criteria) this;
        }

        public Criteria andWtutEqualTo(String value) {
            addCriterion("WTUT =", value, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutNotEqualTo(String value) {
            addCriterion("WTUT <>", value, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutGreaterThan(String value) {
            addCriterion("WTUT >", value, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutGreaterThanOrEqualTo(String value) {
            addCriterion("WTUT >=", value, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutLessThan(String value) {
            addCriterion("WTUT <", value, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutLessThanOrEqualTo(String value) {
            addCriterion("WTUT <=", value, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutLike(String value) {
            addCriterion("WTUT like", value, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutNotLike(String value) {
            addCriterion("WTUT not like", value, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutIn(List<String> values) {
            addCriterion("WTUT in", values, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutNotIn(List<String> values) {
            addCriterion("WTUT not in", values, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutBetween(String value1, String value2) {
            addCriterion("WTUT between", value1, value2, "wtut");
            return (Criteria) this;
        }

        public Criteria andWtutNotBetween(String value1, String value2) {
            addCriterion("WTUT not between", value1, value2, "wtut");
            return (Criteria) this;
        }

        public Criteria andUpSalIsNull() {
            addCriterion("UP_SAL is null");
            return (Criteria) this;
        }

        public Criteria andUpSalIsNotNull() {
            addCriterion("UP_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andUpSalEqualTo(BigDecimal value) {
            addCriterion("UP_SAL =", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalNotEqualTo(BigDecimal value) {
            addCriterion("UP_SAL <>", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalGreaterThan(BigDecimal value) {
            addCriterion("UP_SAL >", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_SAL >=", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalLessThan(BigDecimal value) {
            addCriterion("UP_SAL <", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_SAL <=", value, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalIn(List<BigDecimal> values) {
            addCriterion("UP_SAL in", values, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalNotIn(List<BigDecimal> values) {
            addCriterion("UP_SAL not in", values, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_SAL between", value1, value2, "upSal");
            return (Criteria) this;
        }

        public Criteria andUpSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_SAL not between", value1, value2, "upSal");
            return (Criteria) this;
        }

        public Criteria andChkNumIsNull() {
            addCriterion("CHK_NUM is null");
            return (Criteria) this;
        }

        public Criteria andChkNumIsNotNull() {
            addCriterion("CHK_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andChkNumEqualTo(String value) {
            addCriterion("CHK_NUM =", value, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumNotEqualTo(String value) {
            addCriterion("CHK_NUM <>", value, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumGreaterThan(String value) {
            addCriterion("CHK_NUM >", value, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_NUM >=", value, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumLessThan(String value) {
            addCriterion("CHK_NUM <", value, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumLessThanOrEqualTo(String value) {
            addCriterion("CHK_NUM <=", value, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumLike(String value) {
            addCriterion("CHK_NUM like", value, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumNotLike(String value) {
            addCriterion("CHK_NUM not like", value, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumIn(List<String> values) {
            addCriterion("CHK_NUM in", values, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumNotIn(List<String> values) {
            addCriterion("CHK_NUM not in", values, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumBetween(String value1, String value2) {
            addCriterion("CHK_NUM between", value1, value2, "chkNum");
            return (Criteria) this;
        }

        public Criteria andChkNumNotBetween(String value1, String value2) {
            addCriterion("CHK_NUM not between", value1, value2, "chkNum");
            return (Criteria) this;
        }

        public Criteria andPrdLevelIsNull() {
            addCriterion("PRD_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPrdLevelIsNotNull() {
            addCriterion("PRD_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPrdLevelEqualTo(String value) {
            addCriterion("PRD_LEVEL =", value, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelNotEqualTo(String value) {
            addCriterion("PRD_LEVEL <>", value, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelGreaterThan(String value) {
            addCriterion("PRD_LEVEL >", value, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_LEVEL >=", value, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelLessThan(String value) {
            addCriterion("PRD_LEVEL <", value, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelLessThanOrEqualTo(String value) {
            addCriterion("PRD_LEVEL <=", value, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelLike(String value) {
            addCriterion("PRD_LEVEL like", value, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelNotLike(String value) {
            addCriterion("PRD_LEVEL not like", value, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelIn(List<String> values) {
            addCriterion("PRD_LEVEL in", values, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelNotIn(List<String> values) {
            addCriterion("PRD_LEVEL not in", values, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelBetween(String value1, String value2) {
            addCriterion("PRD_LEVEL between", value1, value2, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdLevelNotBetween(String value1, String value2) {
            addCriterion("PRD_LEVEL not between", value1, value2, "prdLevel");
            return (Criteria) this;
        }

        public Criteria andPrdPackIsNull() {
            addCriterion("PRD_PACK is null");
            return (Criteria) this;
        }

        public Criteria andPrdPackIsNotNull() {
            addCriterion("PRD_PACK is not null");
            return (Criteria) this;
        }

        public Criteria andPrdPackEqualTo(String value) {
            addCriterion("PRD_PACK =", value, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackNotEqualTo(String value) {
            addCriterion("PRD_PACK <>", value, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackGreaterThan(String value) {
            addCriterion("PRD_PACK >", value, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_PACK >=", value, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackLessThan(String value) {
            addCriterion("PRD_PACK <", value, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackLessThanOrEqualTo(String value) {
            addCriterion("PRD_PACK <=", value, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackLike(String value) {
            addCriterion("PRD_PACK like", value, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackNotLike(String value) {
            addCriterion("PRD_PACK not like", value, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackIn(List<String> values) {
            addCriterion("PRD_PACK in", values, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackNotIn(List<String> values) {
            addCriterion("PRD_PACK not in", values, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackBetween(String value1, String value2) {
            addCriterion("PRD_PACK between", value1, value2, "prdPack");
            return (Criteria) this;
        }

        public Criteria andPrdPackNotBetween(String value1, String value2) {
            addCriterion("PRD_PACK not between", value1, value2, "prdPack");
            return (Criteria) this;
        }

        public Criteria andAccNoInIsNull() {
            addCriterion("ACC_NO_IN is null");
            return (Criteria) this;
        }

        public Criteria andAccNoInIsNotNull() {
            addCriterion("ACC_NO_IN is not null");
            return (Criteria) this;
        }

        public Criteria andAccNoInEqualTo(String value) {
            addCriterion("ACC_NO_IN =", value, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInNotEqualTo(String value) {
            addCriterion("ACC_NO_IN <>", value, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInGreaterThan(String value) {
            addCriterion("ACC_NO_IN >", value, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NO_IN >=", value, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInLessThan(String value) {
            addCriterion("ACC_NO_IN <", value, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInLessThanOrEqualTo(String value) {
            addCriterion("ACC_NO_IN <=", value, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInLike(String value) {
            addCriterion("ACC_NO_IN like", value, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInNotLike(String value) {
            addCriterion("ACC_NO_IN not like", value, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInIn(List<String> values) {
            addCriterion("ACC_NO_IN in", values, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInNotIn(List<String> values) {
            addCriterion("ACC_NO_IN not in", values, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInBetween(String value1, String value2) {
            addCriterion("ACC_NO_IN between", value1, value2, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoInNotBetween(String value1, String value2) {
            addCriterion("ACC_NO_IN not between", value1, value2, "accNoIn");
            return (Criteria) this;
        }

        public Criteria andAccNoOutIsNull() {
            addCriterion("ACC_NO_OUT is null");
            return (Criteria) this;
        }

        public Criteria andAccNoOutIsNotNull() {
            addCriterion("ACC_NO_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andAccNoOutEqualTo(String value) {
            addCriterion("ACC_NO_OUT =", value, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutNotEqualTo(String value) {
            addCriterion("ACC_NO_OUT <>", value, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutGreaterThan(String value) {
            addCriterion("ACC_NO_OUT >", value, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NO_OUT >=", value, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutLessThan(String value) {
            addCriterion("ACC_NO_OUT <", value, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutLessThanOrEqualTo(String value) {
            addCriterion("ACC_NO_OUT <=", value, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutLike(String value) {
            addCriterion("ACC_NO_OUT like", value, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutNotLike(String value) {
            addCriterion("ACC_NO_OUT not like", value, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutIn(List<String> values) {
            addCriterion("ACC_NO_OUT in", values, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutNotIn(List<String> values) {
            addCriterion("ACC_NO_OUT not in", values, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutBetween(String value1, String value2) {
            addCriterion("ACC_NO_OUT between", value1, value2, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andAccNoOutNotBetween(String value1, String value2) {
            addCriterion("ACC_NO_OUT not between", value1, value2, "accNoOut");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNull() {
            addCriterion("CODENAME is null");
            return (Criteria) this;
        }

        public Criteria andCodenameIsNotNull() {
            addCriterion("CODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCodenameEqualTo(String value) {
            addCriterion("CODENAME =", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotEqualTo(String value) {
            addCriterion("CODENAME <>", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThan(String value) {
            addCriterion("CODENAME >", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameGreaterThanOrEqualTo(String value) {
            addCriterion("CODENAME >=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThan(String value) {
            addCriterion("CODENAME <", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLessThanOrEqualTo(String value) {
            addCriterion("CODENAME <=", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameLike(String value) {
            addCriterion("CODENAME like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotLike(String value) {
            addCriterion("CODENAME not like", value, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameIn(List<String> values) {
            addCriterion("CODENAME in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotIn(List<String> values) {
            addCriterion("CODENAME not in", values, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameBetween(String value1, String value2) {
            addCriterion("CODENAME between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andCodenameNotBetween(String value1, String value2) {
            addCriterion("CODENAME not between", value1, value2, "codename");
            return (Criteria) this;
        }

        public Criteria andChkTaxIsNull() {
            addCriterion("CHK_TAX is null");
            return (Criteria) this;
        }

        public Criteria andChkTaxIsNotNull() {
            addCriterion("CHK_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andChkTaxEqualTo(String value) {
            addCriterion("CHK_TAX =", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxNotEqualTo(String value) {
            addCriterion("CHK_TAX <>", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxGreaterThan(String value) {
            addCriterion("CHK_TAX >", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_TAX >=", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxLessThan(String value) {
            addCriterion("CHK_TAX <", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxLessThanOrEqualTo(String value) {
            addCriterion("CHK_TAX <=", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxLike(String value) {
            addCriterion("CHK_TAX like", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxNotLike(String value) {
            addCriterion("CHK_TAX not like", value, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxIn(List<String> values) {
            addCriterion("CHK_TAX in", values, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxNotIn(List<String> values) {
            addCriterion("CHK_TAX not in", values, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxBetween(String value1, String value2) {
            addCriterion("CHK_TAX between", value1, value2, "chkTax");
            return (Criteria) this;
        }

        public Criteria andChkTaxNotBetween(String value1, String value2) {
            addCriterion("CHK_TAX not between", value1, value2, "chkTax");
            return (Criteria) this;
        }

        public Criteria andUprTpIsNull() {
            addCriterion("UPR_TP is null");
            return (Criteria) this;
        }

        public Criteria andUprTpIsNotNull() {
            addCriterion("UPR_TP is not null");
            return (Criteria) this;
        }

        public Criteria andUprTpEqualTo(BigDecimal value) {
            addCriterion("UPR_TP =", value, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpNotEqualTo(BigDecimal value) {
            addCriterion("UPR_TP <>", value, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpGreaterThan(BigDecimal value) {
            addCriterion("UPR_TP >", value, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_TP >=", value, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpLessThan(BigDecimal value) {
            addCriterion("UPR_TP <", value, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_TP <=", value, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpIn(List<BigDecimal> values) {
            addCriterion("UPR_TP in", values, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpNotIn(List<BigDecimal> values) {
            addCriterion("UPR_TP not in", values, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_TP between", value1, value2, "uprTp");
            return (Criteria) this;
        }

        public Criteria andUprTpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_TP not between", value1, value2, "uprTp");
            return (Criteria) this;
        }

        public Criteria andBackRtoIsNull() {
            addCriterion("BACK_RTO is null");
            return (Criteria) this;
        }

        public Criteria andBackRtoIsNotNull() {
            addCriterion("BACK_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andBackRtoEqualTo(BigDecimal value) {
            addCriterion("BACK_RTO =", value, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoNotEqualTo(BigDecimal value) {
            addCriterion("BACK_RTO <>", value, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoGreaterThan(BigDecimal value) {
            addCriterion("BACK_RTO >", value, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACK_RTO >=", value, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoLessThan(BigDecimal value) {
            addCriterion("BACK_RTO <", value, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACK_RTO <=", value, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoIn(List<BigDecimal> values) {
            addCriterion("BACK_RTO in", values, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoNotIn(List<BigDecimal> values) {
            addCriterion("BACK_RTO not in", values, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACK_RTO between", value1, value2, "backRto");
            return (Criteria) this;
        }

        public Criteria andBackRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACK_RTO not between", value1, value2, "backRto");
            return (Criteria) this;
        }

        public Criteria andDepIsNull() {
            addCriterion("DEP is null");
            return (Criteria) this;
        }

        public Criteria andDepIsNotNull() {
            addCriterion("DEP is not null");
            return (Criteria) this;
        }

        public Criteria andDepEqualTo(String value) {
            addCriterion("DEP =", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotEqualTo(String value) {
            addCriterion("DEP <>", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThan(String value) {
            addCriterion("DEP >", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThanOrEqualTo(String value) {
            addCriterion("DEP >=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThan(String value) {
            addCriterion("DEP <", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThanOrEqualTo(String value) {
            addCriterion("DEP <=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLike(String value) {
            addCriterion("DEP like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotLike(String value) {
            addCriterion("DEP not like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepIn(List<String> values) {
            addCriterion("DEP in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotIn(List<String> values) {
            addCriterion("DEP not in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepBetween(String value1, String value2) {
            addCriterion("DEP between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotBetween(String value1, String value2) {
            addCriterion("DEP not between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andPricexsIsNull() {
            addCriterion("PRICEXS is null");
            return (Criteria) this;
        }

        public Criteria andPricexsIsNotNull() {
            addCriterion("PRICEXS is not null");
            return (Criteria) this;
        }

        public Criteria andPricexsEqualTo(BigDecimal value) {
            addCriterion("PRICEXS =", value, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsNotEqualTo(BigDecimal value) {
            addCriterion("PRICEXS <>", value, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsGreaterThan(BigDecimal value) {
            addCriterion("PRICEXS >", value, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEXS >=", value, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsLessThan(BigDecimal value) {
            addCriterion("PRICEXS <", value, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEXS <=", value, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsIn(List<BigDecimal> values) {
            addCriterion("PRICEXS in", values, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsNotIn(List<BigDecimal> values) {
            addCriterion("PRICEXS not in", values, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEXS between", value1, value2, "pricexs");
            return (Criteria) this;
        }

        public Criteria andPricexsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEXS not between", value1, value2, "pricexs");
            return (Criteria) this;
        }

        public Criteria andTypeCstIsNull() {
            addCriterion("TYPE_CST is null");
            return (Criteria) this;
        }

        public Criteria andTypeCstIsNotNull() {
            addCriterion("TYPE_CST is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCstEqualTo(String value) {
            addCriterion("TYPE_CST =", value, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstNotEqualTo(String value) {
            addCriterion("TYPE_CST <>", value, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstGreaterThan(String value) {
            addCriterion("TYPE_CST >", value, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_CST >=", value, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstLessThan(String value) {
            addCriterion("TYPE_CST <", value, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstLessThanOrEqualTo(String value) {
            addCriterion("TYPE_CST <=", value, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstLike(String value) {
            addCriterion("TYPE_CST like", value, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstNotLike(String value) {
            addCriterion("TYPE_CST not like", value, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstIn(List<String> values) {
            addCriterion("TYPE_CST in", values, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstNotIn(List<String> values) {
            addCriterion("TYPE_CST not in", values, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstBetween(String value1, String value2) {
            addCriterion("TYPE_CST between", value1, value2, "typeCst");
            return (Criteria) this;
        }

        public Criteria andTypeCstNotBetween(String value1, String value2) {
            addCriterion("TYPE_CST not between", value1, value2, "typeCst");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtIsNull() {
            addCriterion("PRD_NO_SGT is null");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtIsNotNull() {
            addCriterion("PRD_NO_SGT is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtEqualTo(String value) {
            addCriterion("PRD_NO_SGT =", value, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtNotEqualTo(String value) {
            addCriterion("PRD_NO_SGT <>", value, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtGreaterThan(String value) {
            addCriterion("PRD_NO_SGT >", value, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NO_SGT >=", value, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtLessThan(String value) {
            addCriterion("PRD_NO_SGT <", value, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtLessThanOrEqualTo(String value) {
            addCriterion("PRD_NO_SGT <=", value, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtLike(String value) {
            addCriterion("PRD_NO_SGT like", value, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtNotLike(String value) {
            addCriterion("PRD_NO_SGT not like", value, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtIn(List<String> values) {
            addCriterion("PRD_NO_SGT in", values, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtNotIn(List<String> values) {
            addCriterion("PRD_NO_SGT not in", values, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtBetween(String value1, String value2) {
            addCriterion("PRD_NO_SGT between", value1, value2, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andPrdNoSgtNotBetween(String value1, String value2) {
            addCriterion("PRD_NO_SGT not between", value1, value2, "prdNoSgt");
            return (Criteria) this;
        }

        public Criteria andHsNoIsNull() {
            addCriterion("HS_NO is null");
            return (Criteria) this;
        }

        public Criteria andHsNoIsNotNull() {
            addCriterion("HS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andHsNoEqualTo(String value) {
            addCriterion("HS_NO =", value, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoNotEqualTo(String value) {
            addCriterion("HS_NO <>", value, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoGreaterThan(String value) {
            addCriterion("HS_NO >", value, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoGreaterThanOrEqualTo(String value) {
            addCriterion("HS_NO >=", value, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoLessThan(String value) {
            addCriterion("HS_NO <", value, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoLessThanOrEqualTo(String value) {
            addCriterion("HS_NO <=", value, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoLike(String value) {
            addCriterion("HS_NO like", value, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoNotLike(String value) {
            addCriterion("HS_NO not like", value, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoIn(List<String> values) {
            addCriterion("HS_NO in", values, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoNotIn(List<String> values) {
            addCriterion("HS_NO not in", values, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoBetween(String value1, String value2) {
            addCriterion("HS_NO between", value1, value2, "hsNo");
            return (Criteria) this;
        }

        public Criteria andHsNoNotBetween(String value1, String value2) {
            addCriterion("HS_NO not between", value1, value2, "hsNo");
            return (Criteria) this;
        }

        public Criteria andUnitSgtIsNull() {
            addCriterion("UNIT_SGT is null");
            return (Criteria) this;
        }

        public Criteria andUnitSgtIsNotNull() {
            addCriterion("UNIT_SGT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitSgtEqualTo(String value) {
            addCriterion("UNIT_SGT =", value, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtNotEqualTo(String value) {
            addCriterion("UNIT_SGT <>", value, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtGreaterThan(String value) {
            addCriterion("UNIT_SGT >", value, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_SGT >=", value, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtLessThan(String value) {
            addCriterion("UNIT_SGT <", value, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtLessThanOrEqualTo(String value) {
            addCriterion("UNIT_SGT <=", value, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtLike(String value) {
            addCriterion("UNIT_SGT like", value, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtNotLike(String value) {
            addCriterion("UNIT_SGT not like", value, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtIn(List<String> values) {
            addCriterion("UNIT_SGT in", values, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtNotIn(List<String> values) {
            addCriterion("UNIT_SGT not in", values, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtBetween(String value1, String value2) {
            addCriterion("UNIT_SGT between", value1, value2, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andUnitSgtNotBetween(String value1, String value2) {
            addCriterion("UNIT_SGT not between", value1, value2, "unitSgt");
            return (Criteria) this;
        }

        public Criteria andSgtRateIsNull() {
            addCriterion("SGT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andSgtRateIsNotNull() {
            addCriterion("SGT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andSgtRateEqualTo(BigDecimal value) {
            addCriterion("SGT_RATE =", value, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateNotEqualTo(BigDecimal value) {
            addCriterion("SGT_RATE <>", value, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateGreaterThan(BigDecimal value) {
            addCriterion("SGT_RATE >", value, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SGT_RATE >=", value, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateLessThan(BigDecimal value) {
            addCriterion("SGT_RATE <", value, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SGT_RATE <=", value, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateIn(List<BigDecimal> values) {
            addCriterion("SGT_RATE in", values, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateNotIn(List<BigDecimal> values) {
            addCriterion("SGT_RATE not in", values, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SGT_RATE between", value1, value2, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andSgtRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SGT_RATE not between", value1, value2, "sgtRate");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNull() {
            addCriterion("VALID_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andValidDaysIsNotNull() {
            addCriterion("VALID_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andValidDaysEqualTo(Short value) {
            addCriterion("VALID_DAYS =", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotEqualTo(Short value) {
            addCriterion("VALID_DAYS <>", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThan(Short value) {
            addCriterion("VALID_DAYS >", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("VALID_DAYS >=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThan(Short value) {
            addCriterion("VALID_DAYS <", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysLessThanOrEqualTo(Short value) {
            addCriterion("VALID_DAYS <=", value, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysIn(List<Short> values) {
            addCriterion("VALID_DAYS in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotIn(List<Short> values) {
            addCriterion("VALID_DAYS not in", values, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysBetween(Short value1, Short value2) {
            addCriterion("VALID_DAYS between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andValidDaysNotBetween(Short value1, Short value2) {
            addCriterion("VALID_DAYS not between", value1, value2, "validDays");
            return (Criteria) this;
        }

        public Criteria andNeedDdIsNull() {
            addCriterion("NEED_DD is null");
            return (Criteria) this;
        }

        public Criteria andNeedDdIsNotNull() {
            addCriterion("NEED_DD is not null");
            return (Criteria) this;
        }

        public Criteria andNeedDdEqualTo(Short value) {
            addCriterion("NEED_DD =", value, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdNotEqualTo(Short value) {
            addCriterion("NEED_DD <>", value, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdGreaterThan(Short value) {
            addCriterion("NEED_DD >", value, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdGreaterThanOrEqualTo(Short value) {
            addCriterion("NEED_DD >=", value, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdLessThan(Short value) {
            addCriterion("NEED_DD <", value, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdLessThanOrEqualTo(Short value) {
            addCriterion("NEED_DD <=", value, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdIn(List<Short> values) {
            addCriterion("NEED_DD in", values, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdNotIn(List<Short> values) {
            addCriterion("NEED_DD not in", values, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdBetween(Short value1, Short value2) {
            addCriterion("NEED_DD between", value1, value2, "needDd");
            return (Criteria) this;
        }

        public Criteria andNeedDdNotBetween(Short value1, Short value2) {
            addCriterion("NEED_DD not between", value1, value2, "needDd");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNull() {
            addCriterion("MOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNotNull() {
            addCriterion("MOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMobIdEqualTo(String value) {
            addCriterion("MOB_ID =", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotEqualTo(String value) {
            addCriterion("MOB_ID <>", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThan(String value) {
            addCriterion("MOB_ID >", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThanOrEqualTo(String value) {
            addCriterion("MOB_ID >=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThan(String value) {
            addCriterion("MOB_ID <", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThanOrEqualTo(String value) {
            addCriterion("MOB_ID <=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLike(String value) {
            addCriterion("MOB_ID like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotLike(String value) {
            addCriterion("MOB_ID not like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdIn(List<String> values) {
            addCriterion("MOB_ID in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotIn(List<String> values) {
            addCriterion("MOB_ID not in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdBetween(String value1, String value2) {
            addCriterion("MOB_ID between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotBetween(String value1, String value2) {
            addCriterion("MOB_ID not between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andStartDdIsNull() {
            addCriterion("START_DD is null");
            return (Criteria) this;
        }

        public Criteria andStartDdIsNotNull() {
            addCriterion("START_DD is not null");
            return (Criteria) this;
        }

        public Criteria andStartDdEqualTo(Date value) {
            addCriterion("START_DD =", value, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdNotEqualTo(Date value) {
            addCriterion("START_DD <>", value, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdGreaterThan(Date value) {
            addCriterion("START_DD >", value, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DD >=", value, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdLessThan(Date value) {
            addCriterion("START_DD <", value, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdLessThanOrEqualTo(Date value) {
            addCriterion("START_DD <=", value, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdIn(List<Date> values) {
            addCriterion("START_DD in", values, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdNotIn(List<Date> values) {
            addCriterion("START_DD not in", values, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdBetween(Date value1, Date value2) {
            addCriterion("START_DD between", value1, value2, "startDd");
            return (Criteria) this;
        }

        public Criteria andStartDdNotBetween(Date value1, Date value2) {
            addCriterion("START_DD not between", value1, value2, "startDd");
            return (Criteria) this;
        }

        public Criteria andChgDaysIsNull() {
            addCriterion("CHG_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andChgDaysIsNotNull() {
            addCriterion("CHG_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andChgDaysEqualTo(Short value) {
            addCriterion("CHG_DAYS =", value, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysNotEqualTo(Short value) {
            addCriterion("CHG_DAYS <>", value, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysGreaterThan(Short value) {
            addCriterion("CHG_DAYS >", value, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("CHG_DAYS >=", value, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysLessThan(Short value) {
            addCriterion("CHG_DAYS <", value, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysLessThanOrEqualTo(Short value) {
            addCriterion("CHG_DAYS <=", value, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysIn(List<Short> values) {
            addCriterion("CHG_DAYS in", values, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysNotIn(List<Short> values) {
            addCriterion("CHG_DAYS not in", values, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysBetween(Short value1, Short value2) {
            addCriterion("CHG_DAYS between", value1, value2, "chgDays");
            return (Criteria) this;
        }

        public Criteria andChgDaysNotBetween(Short value1, Short value2) {
            addCriterion("CHG_DAYS not between", value1, value2, "chgDays");
            return (Criteria) this;
        }

        public Criteria andAccNoOriIsNull() {
            addCriterion("ACC_NO_ORI is null");
            return (Criteria) this;
        }

        public Criteria andAccNoOriIsNotNull() {
            addCriterion("ACC_NO_ORI is not null");
            return (Criteria) this;
        }

        public Criteria andAccNoOriEqualTo(String value) {
            addCriterion("ACC_NO_ORI =", value, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriNotEqualTo(String value) {
            addCriterion("ACC_NO_ORI <>", value, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriGreaterThan(String value) {
            addCriterion("ACC_NO_ORI >", value, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NO_ORI >=", value, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriLessThan(String value) {
            addCriterion("ACC_NO_ORI <", value, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriLessThanOrEqualTo(String value) {
            addCriterion("ACC_NO_ORI <=", value, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriLike(String value) {
            addCriterion("ACC_NO_ORI like", value, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriNotLike(String value) {
            addCriterion("ACC_NO_ORI not like", value, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriIn(List<String> values) {
            addCriterion("ACC_NO_ORI in", values, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriNotIn(List<String> values) {
            addCriterion("ACC_NO_ORI not in", values, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriBetween(String value1, String value2) {
            addCriterion("ACC_NO_ORI between", value1, value2, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccNoOriNotBetween(String value1, String value2) {
            addCriterion("ACC_NO_ORI not between", value1, value2, "accNoOri");
            return (Criteria) this;
        }

        public Criteria andAccSaInIsNull() {
            addCriterion("ACC_SA_IN is null");
            return (Criteria) this;
        }

        public Criteria andAccSaInIsNotNull() {
            addCriterion("ACC_SA_IN is not null");
            return (Criteria) this;
        }

        public Criteria andAccSaInEqualTo(String value) {
            addCriterion("ACC_SA_IN =", value, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInNotEqualTo(String value) {
            addCriterion("ACC_SA_IN <>", value, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInGreaterThan(String value) {
            addCriterion("ACC_SA_IN >", value, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_SA_IN >=", value, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInLessThan(String value) {
            addCriterion("ACC_SA_IN <", value, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInLessThanOrEqualTo(String value) {
            addCriterion("ACC_SA_IN <=", value, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInLike(String value) {
            addCriterion("ACC_SA_IN like", value, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInNotLike(String value) {
            addCriterion("ACC_SA_IN not like", value, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInIn(List<String> values) {
            addCriterion("ACC_SA_IN in", values, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInNotIn(List<String> values) {
            addCriterion("ACC_SA_IN not in", values, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInBetween(String value1, String value2) {
            addCriterion("ACC_SA_IN between", value1, value2, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaInNotBetween(String value1, String value2) {
            addCriterion("ACC_SA_IN not between", value1, value2, "accSaIn");
            return (Criteria) this;
        }

        public Criteria andAccSaCstIsNull() {
            addCriterion("ACC_SA_CST is null");
            return (Criteria) this;
        }

        public Criteria andAccSaCstIsNotNull() {
            addCriterion("ACC_SA_CST is not null");
            return (Criteria) this;
        }

        public Criteria andAccSaCstEqualTo(String value) {
            addCriterion("ACC_SA_CST =", value, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstNotEqualTo(String value) {
            addCriterion("ACC_SA_CST <>", value, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstGreaterThan(String value) {
            addCriterion("ACC_SA_CST >", value, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_SA_CST >=", value, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstLessThan(String value) {
            addCriterion("ACC_SA_CST <", value, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstLessThanOrEqualTo(String value) {
            addCriterion("ACC_SA_CST <=", value, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstLike(String value) {
            addCriterion("ACC_SA_CST like", value, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstNotLike(String value) {
            addCriterion("ACC_SA_CST not like", value, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstIn(List<String> values) {
            addCriterion("ACC_SA_CST in", values, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstNotIn(List<String> values) {
            addCriterion("ACC_SA_CST not in", values, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstBetween(String value1, String value2) {
            addCriterion("ACC_SA_CST between", value1, value2, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andAccSaCstNotBetween(String value1, String value2) {
            addCriterion("ACC_SA_CST not between", value1, value2, "accSaCst");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkIsNull() {
            addCriterion("CHK_PRD_MARK is null");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkIsNotNull() {
            addCriterion("CHK_PRD_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkEqualTo(String value) {
            addCriterion("CHK_PRD_MARK =", value, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkNotEqualTo(String value) {
            addCriterion("CHK_PRD_MARK <>", value, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkGreaterThan(String value) {
            addCriterion("CHK_PRD_MARK >", value, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_PRD_MARK >=", value, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkLessThan(String value) {
            addCriterion("CHK_PRD_MARK <", value, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkLessThanOrEqualTo(String value) {
            addCriterion("CHK_PRD_MARK <=", value, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkLike(String value) {
            addCriterion("CHK_PRD_MARK like", value, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkNotLike(String value) {
            addCriterion("CHK_PRD_MARK not like", value, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkIn(List<String> values) {
            addCriterion("CHK_PRD_MARK in", values, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkNotIn(List<String> values) {
            addCriterion("CHK_PRD_MARK not in", values, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkBetween(String value1, String value2) {
            addCriterion("CHK_PRD_MARK between", value1, value2, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkPrdMarkNotBetween(String value1, String value2) {
            addCriterion("CHK_PRD_MARK not between", value1, value2, "chkPrdMark");
            return (Criteria) this;
        }

        public Criteria andChkManIsNull() {
            addCriterion("CHK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andChkManIsNotNull() {
            addCriterion("CHK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andChkManEqualTo(String value) {
            addCriterion("CHK_MAN =", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotEqualTo(String value) {
            addCriterion("CHK_MAN <>", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThan(String value) {
            addCriterion("CHK_MAN >", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MAN >=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThan(String value) {
            addCriterion("CHK_MAN <", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThanOrEqualTo(String value) {
            addCriterion("CHK_MAN <=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLike(String value) {
            addCriterion("CHK_MAN like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotLike(String value) {
            addCriterion("CHK_MAN not like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManIn(List<String> values) {
            addCriterion("CHK_MAN in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotIn(List<String> values) {
            addCriterion("CHK_MAN not in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManBetween(String value1, String value2) {
            addCriterion("CHK_MAN between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotBetween(String value1, String value2) {
            addCriterion("CHK_MAN not between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNull() {
            addCriterion("CLS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNotNull() {
            addCriterion("CLS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClsDateEqualTo(Date value) {
            addCriterion("CLS_DATE =", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotEqualTo(Date value) {
            addCriterion("CLS_DATE <>", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThan(Date value) {
            addCriterion("CLS_DATE >", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE >=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThan(Date value) {
            addCriterion("CLS_DATE <", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE <=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateIn(List<Date> values) {
            addCriterion("CLS_DATE in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotIn(List<Date> values) {
            addCriterion("CLS_DATE not in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE not between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andLenPrdIsNull() {
            addCriterion("LEN_PRD is null");
            return (Criteria) this;
        }

        public Criteria andLenPrdIsNotNull() {
            addCriterion("LEN_PRD is not null");
            return (Criteria) this;
        }

        public Criteria andLenPrdEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD =", value, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdNotEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD <>", value, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdGreaterThan(BigDecimal value) {
            addCriterion("LEN_PRD >", value, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD >=", value, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdLessThan(BigDecimal value) {
            addCriterion("LEN_PRD <", value, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD <=", value, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdIn(List<BigDecimal> values) {
            addCriterion("LEN_PRD in", values, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdNotIn(List<BigDecimal> values) {
            addCriterion("LEN_PRD not in", values, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEN_PRD between", value1, value2, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andLenPrdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEN_PRD not between", value1, value2, "lenPrd");
            return (Criteria) this;
        }

        public Criteria andUtLenIsNull() {
            addCriterion("UT_LEN is null");
            return (Criteria) this;
        }

        public Criteria andUtLenIsNotNull() {
            addCriterion("UT_LEN is not null");
            return (Criteria) this;
        }

        public Criteria andUtLenEqualTo(String value) {
            addCriterion("UT_LEN =", value, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenNotEqualTo(String value) {
            addCriterion("UT_LEN <>", value, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenGreaterThan(String value) {
            addCriterion("UT_LEN >", value, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenGreaterThanOrEqualTo(String value) {
            addCriterion("UT_LEN >=", value, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenLessThan(String value) {
            addCriterion("UT_LEN <", value, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenLessThanOrEqualTo(String value) {
            addCriterion("UT_LEN <=", value, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenLike(String value) {
            addCriterion("UT_LEN like", value, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenNotLike(String value) {
            addCriterion("UT_LEN not like", value, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenIn(List<String> values) {
            addCriterion("UT_LEN in", values, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenNotIn(List<String> values) {
            addCriterion("UT_LEN not in", values, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenBetween(String value1, String value2) {
            addCriterion("UT_LEN between", value1, value2, "utLen");
            return (Criteria) this;
        }

        public Criteria andUtLenNotBetween(String value1, String value2) {
            addCriterion("UT_LEN not between", value1, value2, "utLen");
            return (Criteria) this;
        }

        public Criteria andWidthPrdIsNull() {
            addCriterion("WIDTH_PRD is null");
            return (Criteria) this;
        }

        public Criteria andWidthPrdIsNotNull() {
            addCriterion("WIDTH_PRD is not null");
            return (Criteria) this;
        }

        public Criteria andWidthPrdEqualTo(BigDecimal value) {
            addCriterion("WIDTH_PRD =", value, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdNotEqualTo(BigDecimal value) {
            addCriterion("WIDTH_PRD <>", value, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdGreaterThan(BigDecimal value) {
            addCriterion("WIDTH_PRD >", value, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTH_PRD >=", value, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdLessThan(BigDecimal value) {
            addCriterion("WIDTH_PRD <", value, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTH_PRD <=", value, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdIn(List<BigDecimal> values) {
            addCriterion("WIDTH_PRD in", values, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdNotIn(List<BigDecimal> values) {
            addCriterion("WIDTH_PRD not in", values, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTH_PRD between", value1, value2, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andWidthPrdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTH_PRD not between", value1, value2, "widthPrd");
            return (Criteria) this;
        }

        public Criteria andUtWidthIsNull() {
            addCriterion("UT_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andUtWidthIsNotNull() {
            addCriterion("UT_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andUtWidthEqualTo(String value) {
            addCriterion("UT_WIDTH =", value, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthNotEqualTo(String value) {
            addCriterion("UT_WIDTH <>", value, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthGreaterThan(String value) {
            addCriterion("UT_WIDTH >", value, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthGreaterThanOrEqualTo(String value) {
            addCriterion("UT_WIDTH >=", value, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthLessThan(String value) {
            addCriterion("UT_WIDTH <", value, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthLessThanOrEqualTo(String value) {
            addCriterion("UT_WIDTH <=", value, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthLike(String value) {
            addCriterion("UT_WIDTH like", value, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthNotLike(String value) {
            addCriterion("UT_WIDTH not like", value, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthIn(List<String> values) {
            addCriterion("UT_WIDTH in", values, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthNotIn(List<String> values) {
            addCriterion("UT_WIDTH not in", values, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthBetween(String value1, String value2) {
            addCriterion("UT_WIDTH between", value1, value2, "utWidth");
            return (Criteria) this;
        }

        public Criteria andUtWidthNotBetween(String value1, String value2) {
            addCriterion("UT_WIDTH not between", value1, value2, "utWidth");
            return (Criteria) this;
        }

        public Criteria andLenPrd2IsNull() {
            addCriterion("LEN_PRD2 is null");
            return (Criteria) this;
        }

        public Criteria andLenPrd2IsNotNull() {
            addCriterion("LEN_PRD2 is not null");
            return (Criteria) this;
        }

        public Criteria andLenPrd2EqualTo(BigDecimal value) {
            addCriterion("LEN_PRD2 =", value, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2NotEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD2 <>", value, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2GreaterThan(BigDecimal value) {
            addCriterion("LEN_PRD2 >", value, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD2 >=", value, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2LessThan(BigDecimal value) {
            addCriterion("LEN_PRD2 <", value, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD2 <=", value, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2In(List<BigDecimal> values) {
            addCriterion("LEN_PRD2 in", values, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2NotIn(List<BigDecimal> values) {
            addCriterion("LEN_PRD2 not in", values, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEN_PRD2 between", value1, value2, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEN_PRD2 not between", value1, value2, "lenPrd2");
            return (Criteria) this;
        }

        public Criteria andLenPrd3IsNull() {
            addCriterion("LEN_PRD3 is null");
            return (Criteria) this;
        }

        public Criteria andLenPrd3IsNotNull() {
            addCriterion("LEN_PRD3 is not null");
            return (Criteria) this;
        }

        public Criteria andLenPrd3EqualTo(BigDecimal value) {
            addCriterion("LEN_PRD3 =", value, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3NotEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD3 <>", value, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3GreaterThan(BigDecimal value) {
            addCriterion("LEN_PRD3 >", value, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD3 >=", value, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3LessThan(BigDecimal value) {
            addCriterion("LEN_PRD3 <", value, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEN_PRD3 <=", value, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3In(List<BigDecimal> values) {
            addCriterion("LEN_PRD3 in", values, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3NotIn(List<BigDecimal> values) {
            addCriterion("LEN_PRD3 not in", values, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEN_PRD3 between", value1, value2, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andLenPrd3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEN_PRD3 not between", value1, value2, "lenPrd3");
            return (Criteria) this;
        }

        public Criteria andCaizIsNull() {
            addCriterion("CAIZ is null");
            return (Criteria) this;
        }

        public Criteria andCaizIsNotNull() {
            addCriterion("CAIZ is not null");
            return (Criteria) this;
        }

        public Criteria andCaizEqualTo(String value) {
            addCriterion("CAIZ =", value, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizNotEqualTo(String value) {
            addCriterion("CAIZ <>", value, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizGreaterThan(String value) {
            addCriterion("CAIZ >", value, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizGreaterThanOrEqualTo(String value) {
            addCriterion("CAIZ >=", value, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizLessThan(String value) {
            addCriterion("CAIZ <", value, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizLessThanOrEqualTo(String value) {
            addCriterion("CAIZ <=", value, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizLike(String value) {
            addCriterion("CAIZ like", value, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizNotLike(String value) {
            addCriterion("CAIZ not like", value, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizIn(List<String> values) {
            addCriterion("CAIZ in", values, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizNotIn(List<String> values) {
            addCriterion("CAIZ not in", values, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizBetween(String value1, String value2) {
            addCriterion("CAIZ between", value1, value2, "caiz");
            return (Criteria) this;
        }

        public Criteria andCaizNotBetween(String value1, String value2) {
            addCriterion("CAIZ not between", value1, value2, "caiz");
            return (Criteria) this;
        }

        public Criteria andUsrIsNull() {
            addCriterion("USR is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsNotNull() {
            addCriterion("USR is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEqualTo(String value) {
            addCriterion("USR =", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotEqualTo(String value) {
            addCriterion("USR <>", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThan(String value) {
            addCriterion("USR >", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThanOrEqualTo(String value) {
            addCriterion("USR >=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThan(String value) {
            addCriterion("USR <", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThanOrEqualTo(String value) {
            addCriterion("USR <=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLike(String value) {
            addCriterion("USR like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotLike(String value) {
            addCriterion("USR not like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrIn(List<String> values) {
            addCriterion("USR in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotIn(List<String> values) {
            addCriterion("USR not in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrBetween(String value1, String value2) {
            addCriterion("USR between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotBetween(String value1, String value2) {
            addCriterion("USR not between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNull() {
            addCriterion("SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNotNull() {
            addCriterion("SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateEqualTo(Date value) {
            addCriterion("SYS_DATE =", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotEqualTo(Date value) {
            addCriterion("SYS_DATE <>", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThan(Date value) {
            addCriterion("SYS_DATE >", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE >=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThan(Date value) {
            addCriterion("SYS_DATE <", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE <=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIn(List<Date> values) {
            addCriterion("SYS_DATE in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotIn(List<Date> values) {
            addCriterion("SYS_DATE not in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE not between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSpcIdIsNull() {
            addCriterion("SPC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpcIdIsNotNull() {
            addCriterion("SPC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpcIdEqualTo(Short value) {
            addCriterion("SPC_ID =", value, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdNotEqualTo(Short value) {
            addCriterion("SPC_ID <>", value, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdGreaterThan(Short value) {
            addCriterion("SPC_ID >", value, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdGreaterThanOrEqualTo(Short value) {
            addCriterion("SPC_ID >=", value, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdLessThan(Short value) {
            addCriterion("SPC_ID <", value, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdLessThanOrEqualTo(Short value) {
            addCriterion("SPC_ID <=", value, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdIn(List<Short> values) {
            addCriterion("SPC_ID in", values, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdNotIn(List<Short> values) {
            addCriterion("SPC_ID not in", values, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdBetween(Short value1, Short value2) {
            addCriterion("SPC_ID between", value1, value2, "spcId");
            return (Criteria) this;
        }

        public Criteria andSpcIdNotBetween(Short value1, Short value2) {
            addCriterion("SPC_ID not between", value1, value2, "spcId");
            return (Criteria) this;
        }

        public Criteria andAbcIsNull() {
            addCriterion("ABC is null");
            return (Criteria) this;
        }

        public Criteria andAbcIsNotNull() {
            addCriterion("ABC is not null");
            return (Criteria) this;
        }

        public Criteria andAbcEqualTo(String value) {
            addCriterion("ABC =", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcNotEqualTo(String value) {
            addCriterion("ABC <>", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcGreaterThan(String value) {
            addCriterion("ABC >", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcGreaterThanOrEqualTo(String value) {
            addCriterion("ABC >=", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcLessThan(String value) {
            addCriterion("ABC <", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcLessThanOrEqualTo(String value) {
            addCriterion("ABC <=", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcLike(String value) {
            addCriterion("ABC like", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcNotLike(String value) {
            addCriterion("ABC not like", value, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcIn(List<String> values) {
            addCriterion("ABC in", values, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcNotIn(List<String> values) {
            addCriterion("ABC not in", values, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcBetween(String value1, String value2) {
            addCriterion("ABC between", value1, value2, "abc");
            return (Criteria) this;
        }

        public Criteria andAbcNotBetween(String value1, String value2) {
            addCriterion("ABC not between", value1, value2, "abc");
            return (Criteria) this;
        }

        public Criteria andRtoEpIsNull() {
            addCriterion("RTO_EP is null");
            return (Criteria) this;
        }

        public Criteria andRtoEpIsNotNull() {
            addCriterion("RTO_EP is not null");
            return (Criteria) this;
        }

        public Criteria andRtoEpEqualTo(BigDecimal value) {
            addCriterion("RTO_EP =", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpNotEqualTo(BigDecimal value) {
            addCriterion("RTO_EP <>", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpGreaterThan(BigDecimal value) {
            addCriterion("RTO_EP >", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_EP >=", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpLessThan(BigDecimal value) {
            addCriterion("RTO_EP <", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_EP <=", value, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpIn(List<BigDecimal> values) {
            addCriterion("RTO_EP in", values, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpNotIn(List<BigDecimal> values) {
            addCriterion("RTO_EP not in", values, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_EP between", value1, value2, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andRtoEpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_EP not between", value1, value2, "rtoEp");
            return (Criteria) this;
        }

        public Criteria andZcTypeIsNull() {
            addCriterion("ZC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andZcTypeIsNotNull() {
            addCriterion("ZC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andZcTypeEqualTo(String value) {
            addCriterion("ZC_TYPE =", value, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeNotEqualTo(String value) {
            addCriterion("ZC_TYPE <>", value, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeGreaterThan(String value) {
            addCriterion("ZC_TYPE >", value, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ZC_TYPE >=", value, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeLessThan(String value) {
            addCriterion("ZC_TYPE <", value, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeLessThanOrEqualTo(String value) {
            addCriterion("ZC_TYPE <=", value, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeLike(String value) {
            addCriterion("ZC_TYPE like", value, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeNotLike(String value) {
            addCriterion("ZC_TYPE not like", value, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeIn(List<String> values) {
            addCriterion("ZC_TYPE in", values, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeNotIn(List<String> values) {
            addCriterion("ZC_TYPE not in", values, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeBetween(String value1, String value2) {
            addCriterion("ZC_TYPE between", value1, value2, "zcType");
            return (Criteria) this;
        }

        public Criteria andZcTypeNotBetween(String value1, String value2) {
            addCriterion("ZC_TYPE not between", value1, value2, "zcType");
            return (Criteria) this;
        }

        public Criteria andJjLenIsNull() {
            addCriterion("JJ_LEN is null");
            return (Criteria) this;
        }

        public Criteria andJjLenIsNotNull() {
            addCriterion("JJ_LEN is not null");
            return (Criteria) this;
        }

        public Criteria andJjLenEqualTo(BigDecimal value) {
            addCriterion("JJ_LEN =", value, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenNotEqualTo(BigDecimal value) {
            addCriterion("JJ_LEN <>", value, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenGreaterThan(BigDecimal value) {
            addCriterion("JJ_LEN >", value, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JJ_LEN >=", value, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenLessThan(BigDecimal value) {
            addCriterion("JJ_LEN <", value, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JJ_LEN <=", value, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenIn(List<BigDecimal> values) {
            addCriterion("JJ_LEN in", values, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenNotIn(List<BigDecimal> values) {
            addCriterion("JJ_LEN not in", values, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JJ_LEN between", value1, value2, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JJ_LEN not between", value1, value2, "jjLen");
            return (Criteria) this;
        }

        public Criteria andJjLen2IsNull() {
            addCriterion("JJ_LEN2 is null");
            return (Criteria) this;
        }

        public Criteria andJjLen2IsNotNull() {
            addCriterion("JJ_LEN2 is not null");
            return (Criteria) this;
        }

        public Criteria andJjLen2EqualTo(BigDecimal value) {
            addCriterion("JJ_LEN2 =", value, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2NotEqualTo(BigDecimal value) {
            addCriterion("JJ_LEN2 <>", value, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2GreaterThan(BigDecimal value) {
            addCriterion("JJ_LEN2 >", value, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JJ_LEN2 >=", value, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2LessThan(BigDecimal value) {
            addCriterion("JJ_LEN2 <", value, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("JJ_LEN2 <=", value, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2In(List<BigDecimal> values) {
            addCriterion("JJ_LEN2 in", values, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2NotIn(List<BigDecimal> values) {
            addCriterion("JJ_LEN2 not in", values, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("JJ_LEN2 between", value1, value2, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andJjLen2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JJ_LEN2 not between", value1, value2, "jjLen2");
            return (Criteria) this;
        }

        public Criteria andNotRtnIsNull() {
            addCriterion("NOT_RTN is null");
            return (Criteria) this;
        }

        public Criteria andNotRtnIsNotNull() {
            addCriterion("NOT_RTN is not null");
            return (Criteria) this;
        }

        public Criteria andNotRtnEqualTo(String value) {
            addCriterion("NOT_RTN =", value, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnNotEqualTo(String value) {
            addCriterion("NOT_RTN <>", value, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnGreaterThan(String value) {
            addCriterion("NOT_RTN >", value, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnGreaterThanOrEqualTo(String value) {
            addCriterion("NOT_RTN >=", value, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnLessThan(String value) {
            addCriterion("NOT_RTN <", value, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnLessThanOrEqualTo(String value) {
            addCriterion("NOT_RTN <=", value, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnLike(String value) {
            addCriterion("NOT_RTN like", value, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnNotLike(String value) {
            addCriterion("NOT_RTN not like", value, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnIn(List<String> values) {
            addCriterion("NOT_RTN in", values, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnNotIn(List<String> values) {
            addCriterion("NOT_RTN not in", values, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnBetween(String value1, String value2) {
            addCriterion("NOT_RTN between", value1, value2, "notRtn");
            return (Criteria) this;
        }

        public Criteria andNotRtnNotBetween(String value1, String value2) {
            addCriterion("NOT_RTN not between", value1, value2, "notRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnIsNull() {
            addCriterion("RTO_RTN is null");
            return (Criteria) this;
        }

        public Criteria andRtoRtnIsNotNull() {
            addCriterion("RTO_RTN is not null");
            return (Criteria) this;
        }

        public Criteria andRtoRtnEqualTo(Short value) {
            addCriterion("RTO_RTN =", value, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnNotEqualTo(Short value) {
            addCriterion("RTO_RTN <>", value, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnGreaterThan(Short value) {
            addCriterion("RTO_RTN >", value, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnGreaterThanOrEqualTo(Short value) {
            addCriterion("RTO_RTN >=", value, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnLessThan(Short value) {
            addCriterion("RTO_RTN <", value, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnLessThanOrEqualTo(Short value) {
            addCriterion("RTO_RTN <=", value, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnIn(List<Short> values) {
            addCriterion("RTO_RTN in", values, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnNotIn(List<Short> values) {
            addCriterion("RTO_RTN not in", values, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnBetween(Short value1, Short value2) {
            addCriterion("RTO_RTN between", value1, value2, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andRtoRtnNotBetween(Short value1, Short value2) {
            addCriterion("RTO_RTN not between", value1, value2, "rtoRtn");
            return (Criteria) this;
        }

        public Criteria andAccProCstIsNull() {
            addCriterion("ACC_PRO_CST is null");
            return (Criteria) this;
        }

        public Criteria andAccProCstIsNotNull() {
            addCriterion("ACC_PRO_CST is not null");
            return (Criteria) this;
        }

        public Criteria andAccProCstEqualTo(String value) {
            addCriterion("ACC_PRO_CST =", value, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstNotEqualTo(String value) {
            addCriterion("ACC_PRO_CST <>", value, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstGreaterThan(String value) {
            addCriterion("ACC_PRO_CST >", value, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_PRO_CST >=", value, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstLessThan(String value) {
            addCriterion("ACC_PRO_CST <", value, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstLessThanOrEqualTo(String value) {
            addCriterion("ACC_PRO_CST <=", value, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstLike(String value) {
            addCriterion("ACC_PRO_CST like", value, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstNotLike(String value) {
            addCriterion("ACC_PRO_CST not like", value, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstIn(List<String> values) {
            addCriterion("ACC_PRO_CST in", values, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstNotIn(List<String> values) {
            addCriterion("ACC_PRO_CST not in", values, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstBetween(String value1, String value2) {
            addCriterion("ACC_PRO_CST between", value1, value2, "accProCst");
            return (Criteria) this;
        }

        public Criteria andAccProCstNotBetween(String value1, String value2) {
            addCriterion("ACC_PRO_CST not between", value1, value2, "accProCst");
            return (Criteria) this;
        }

        public Criteria andRtoClIsNull() {
            addCriterion("RTO_CL is null");
            return (Criteria) this;
        }

        public Criteria andRtoClIsNotNull() {
            addCriterion("RTO_CL is not null");
            return (Criteria) this;
        }

        public Criteria andRtoClEqualTo(BigDecimal value) {
            addCriterion("RTO_CL =", value, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClNotEqualTo(BigDecimal value) {
            addCriterion("RTO_CL <>", value, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClGreaterThan(BigDecimal value) {
            addCriterion("RTO_CL >", value, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_CL >=", value, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClLessThan(BigDecimal value) {
            addCriterion("RTO_CL <", value, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_CL <=", value, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClIn(List<BigDecimal> values) {
            addCriterion("RTO_CL in", values, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClNotIn(List<BigDecimal> values) {
            addCriterion("RTO_CL not in", values, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_CL between", value1, value2, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andRtoClNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_CL not between", value1, value2, "rtoCl");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNull() {
            addCriterion("SAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNotNull() {
            addCriterion("SAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSalNoEqualTo(String value) {
            addCriterion("SAL_NO =", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotEqualTo(String value) {
            addCriterion("SAL_NO <>", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThan(String value) {
            addCriterion("SAL_NO >", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_NO >=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThan(String value) {
            addCriterion("SAL_NO <", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThanOrEqualTo(String value) {
            addCriterion("SAL_NO <=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLike(String value) {
            addCriterion("SAL_NO like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotLike(String value) {
            addCriterion("SAL_NO not like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoIn(List<String> values) {
            addCriterion("SAL_NO in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotIn(List<String> values) {
            addCriterion("SAL_NO not in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoBetween(String value1, String value2) {
            addCriterion("SAL_NO between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotBetween(String value1, String value2) {
            addCriterion("SAL_NO not between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andOldCodeIsNull() {
            addCriterion("OLD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOldCodeIsNotNull() {
            addCriterion("OLD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOldCodeEqualTo(String value) {
            addCriterion("OLD_CODE =", value, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeNotEqualTo(String value) {
            addCriterion("OLD_CODE <>", value, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeGreaterThan(String value) {
            addCriterion("OLD_CODE >", value, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_CODE >=", value, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeLessThan(String value) {
            addCriterion("OLD_CODE <", value, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeLessThanOrEqualTo(String value) {
            addCriterion("OLD_CODE <=", value, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeLike(String value) {
            addCriterion("OLD_CODE like", value, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeNotLike(String value) {
            addCriterion("OLD_CODE not like", value, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeIn(List<String> values) {
            addCriterion("OLD_CODE in", values, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeNotIn(List<String> values) {
            addCriterion("OLD_CODE not in", values, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeBetween(String value1, String value2) {
            addCriterion("OLD_CODE between", value1, value2, "oldCode");
            return (Criteria) this;
        }

        public Criteria andOldCodeNotBetween(String value1, String value2) {
            addCriterion("OLD_CODE not between", value1, value2, "oldCode");
            return (Criteria) this;
        }

        public Criteria andSpcId1IsNull() {
            addCriterion("SPC_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andSpcId1IsNotNull() {
            addCriterion("SPC_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpcId1EqualTo(Short value) {
            addCriterion("SPC_ID1 =", value, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1NotEqualTo(Short value) {
            addCriterion("SPC_ID1 <>", value, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1GreaterThan(Short value) {
            addCriterion("SPC_ID1 >", value, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1GreaterThanOrEqualTo(Short value) {
            addCriterion("SPC_ID1 >=", value, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1LessThan(Short value) {
            addCriterion("SPC_ID1 <", value, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1LessThanOrEqualTo(Short value) {
            addCriterion("SPC_ID1 <=", value, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1In(List<Short> values) {
            addCriterion("SPC_ID1 in", values, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1NotIn(List<Short> values) {
            addCriterion("SPC_ID1 not in", values, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1Between(Short value1, Short value2) {
            addCriterion("SPC_ID1 between", value1, value2, "spcId1");
            return (Criteria) this;
        }

        public Criteria andSpcId1NotBetween(Short value1, Short value2) {
            addCriterion("SPC_ID1 not between", value1, value2, "spcId1");
            return (Criteria) this;
        }

        public Criteria andMlUtIsNull() {
            addCriterion("ML_UT is null");
            return (Criteria) this;
        }

        public Criteria andMlUtIsNotNull() {
            addCriterion("ML_UT is not null");
            return (Criteria) this;
        }

        public Criteria andMlUtEqualTo(String value) {
            addCriterion("ML_UT =", value, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtNotEqualTo(String value) {
            addCriterion("ML_UT <>", value, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtGreaterThan(String value) {
            addCriterion("ML_UT >", value, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtGreaterThanOrEqualTo(String value) {
            addCriterion("ML_UT >=", value, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtLessThan(String value) {
            addCriterion("ML_UT <", value, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtLessThanOrEqualTo(String value) {
            addCriterion("ML_UT <=", value, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtLike(String value) {
            addCriterion("ML_UT like", value, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtNotLike(String value) {
            addCriterion("ML_UT not like", value, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtIn(List<String> values) {
            addCriterion("ML_UT in", values, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtNotIn(List<String> values) {
            addCriterion("ML_UT not in", values, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtBetween(String value1, String value2) {
            addCriterion("ML_UT between", value1, value2, "mlUt");
            return (Criteria) this;
        }

        public Criteria andMlUtNotBetween(String value1, String value2) {
            addCriterion("ML_UT not between", value1, value2, "mlUt");
            return (Criteria) this;
        }

        public Criteria andWhLcIsNull() {
            addCriterion("WH_LC is null");
            return (Criteria) this;
        }

        public Criteria andWhLcIsNotNull() {
            addCriterion("WH_LC is not null");
            return (Criteria) this;
        }

        public Criteria andWhLcEqualTo(String value) {
            addCriterion("WH_LC =", value, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcNotEqualTo(String value) {
            addCriterion("WH_LC <>", value, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcGreaterThan(String value) {
            addCriterion("WH_LC >", value, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcGreaterThanOrEqualTo(String value) {
            addCriterion("WH_LC >=", value, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcLessThan(String value) {
            addCriterion("WH_LC <", value, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcLessThanOrEqualTo(String value) {
            addCriterion("WH_LC <=", value, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcLike(String value) {
            addCriterion("WH_LC like", value, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcNotLike(String value) {
            addCriterion("WH_LC not like", value, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcIn(List<String> values) {
            addCriterion("WH_LC in", values, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcNotIn(List<String> values) {
            addCriterion("WH_LC not in", values, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcBetween(String value1, String value2) {
            addCriterion("WH_LC between", value1, value2, "whLc");
            return (Criteria) this;
        }

        public Criteria andWhLcNotBetween(String value1, String value2) {
            addCriterion("WH_LC not between", value1, value2, "whLc");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1IsNull() {
            addCriterion("QUOTE_UT1 is null");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1IsNotNull() {
            addCriterion("QUOTE_UT1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1EqualTo(String value) {
            addCriterion("QUOTE_UT1 =", value, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1NotEqualTo(String value) {
            addCriterion("QUOTE_UT1 <>", value, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1GreaterThan(String value) {
            addCriterion("QUOTE_UT1 >", value, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1GreaterThanOrEqualTo(String value) {
            addCriterion("QUOTE_UT1 >=", value, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1LessThan(String value) {
            addCriterion("QUOTE_UT1 <", value, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1LessThanOrEqualTo(String value) {
            addCriterion("QUOTE_UT1 <=", value, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1Like(String value) {
            addCriterion("QUOTE_UT1 like", value, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1NotLike(String value) {
            addCriterion("QUOTE_UT1 not like", value, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1In(List<String> values) {
            addCriterion("QUOTE_UT1 in", values, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1NotIn(List<String> values) {
            addCriterion("QUOTE_UT1 not in", values, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1Between(String value1, String value2) {
            addCriterion("QUOTE_UT1 between", value1, value2, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt1NotBetween(String value1, String value2) {
            addCriterion("QUOTE_UT1 not between", value1, value2, "quoteUt1");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2IsNull() {
            addCriterion("QUOTE_UT2 is null");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2IsNotNull() {
            addCriterion("QUOTE_UT2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2EqualTo(String value) {
            addCriterion("QUOTE_UT2 =", value, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2NotEqualTo(String value) {
            addCriterion("QUOTE_UT2 <>", value, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2GreaterThan(String value) {
            addCriterion("QUOTE_UT2 >", value, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2GreaterThanOrEqualTo(String value) {
            addCriterion("QUOTE_UT2 >=", value, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2LessThan(String value) {
            addCriterion("QUOTE_UT2 <", value, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2LessThanOrEqualTo(String value) {
            addCriterion("QUOTE_UT2 <=", value, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2Like(String value) {
            addCriterion("QUOTE_UT2 like", value, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2NotLike(String value) {
            addCriterion("QUOTE_UT2 not like", value, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2In(List<String> values) {
            addCriterion("QUOTE_UT2 in", values, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2NotIn(List<String> values) {
            addCriterion("QUOTE_UT2 not in", values, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2Between(String value1, String value2) {
            addCriterion("QUOTE_UT2 between", value1, value2, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt2NotBetween(String value1, String value2) {
            addCriterion("QUOTE_UT2 not between", value1, value2, "quoteUt2");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3IsNull() {
            addCriterion("QUOTE_UT3 is null");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3IsNotNull() {
            addCriterion("QUOTE_UT3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3EqualTo(String value) {
            addCriterion("QUOTE_UT3 =", value, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3NotEqualTo(String value) {
            addCriterion("QUOTE_UT3 <>", value, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3GreaterThan(String value) {
            addCriterion("QUOTE_UT3 >", value, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3GreaterThanOrEqualTo(String value) {
            addCriterion("QUOTE_UT3 >=", value, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3LessThan(String value) {
            addCriterion("QUOTE_UT3 <", value, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3LessThanOrEqualTo(String value) {
            addCriterion("QUOTE_UT3 <=", value, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3Like(String value) {
            addCriterion("QUOTE_UT3 like", value, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3NotLike(String value) {
            addCriterion("QUOTE_UT3 not like", value, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3In(List<String> values) {
            addCriterion("QUOTE_UT3 in", values, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3NotIn(List<String> values) {
            addCriterion("QUOTE_UT3 not in", values, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3Between(String value1, String value2) {
            addCriterion("QUOTE_UT3 between", value1, value2, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andQuoteUt3NotBetween(String value1, String value2) {
            addCriterion("QUOTE_UT3 not between", value1, value2, "quoteUt3");
            return (Criteria) this;
        }

        public Criteria andPrdPoiIsNull() {
            addCriterion("PRD_POI is null");
            return (Criteria) this;
        }

        public Criteria andPrdPoiIsNotNull() {
            addCriterion("PRD_POI is not null");
            return (Criteria) this;
        }

        public Criteria andPrdPoiEqualTo(Integer value) {
            addCriterion("PRD_POI =", value, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiNotEqualTo(Integer value) {
            addCriterion("PRD_POI <>", value, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiGreaterThan(Integer value) {
            addCriterion("PRD_POI >", value, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRD_POI >=", value, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiLessThan(Integer value) {
            addCriterion("PRD_POI <", value, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiLessThanOrEqualTo(Integer value) {
            addCriterion("PRD_POI <=", value, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiIn(List<Integer> values) {
            addCriterion("PRD_POI in", values, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiNotIn(List<Integer> values) {
            addCriterion("PRD_POI not in", values, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiBetween(Integer value1, Integer value2) {
            addCriterion("PRD_POI between", value1, value2, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andPrdPoiNotBetween(Integer value1, Integer value2) {
            addCriterion("PRD_POI not between", value1, value2, "prdPoi");
            return (Criteria) this;
        }

        public Criteria andQtyMinIsNull() {
            addCriterion("QTY_MIN is null");
            return (Criteria) this;
        }

        public Criteria andQtyMinIsNotNull() {
            addCriterion("QTY_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andQtyMinEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN =", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinNotEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN <>", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinGreaterThan(BigDecimal value) {
            addCriterion("QTY_MIN >", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN >=", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinLessThan(BigDecimal value) {
            addCriterion("QTY_MIN <", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN <=", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinIn(List<BigDecimal> values) {
            addCriterion("QTY_MIN in", values, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinNotIn(List<BigDecimal> values) {
            addCriterion("QTY_MIN not in", values, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MIN between", value1, value2, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MIN not between", value1, value2, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andDzDdIsNull() {
            addCriterion("DZ_DD is null");
            return (Criteria) this;
        }

        public Criteria andDzDdIsNotNull() {
            addCriterion("DZ_DD is not null");
            return (Criteria) this;
        }

        public Criteria andDzDdEqualTo(Date value) {
            addCriterion("DZ_DD =", value, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdNotEqualTo(Date value) {
            addCriterion("DZ_DD <>", value, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdGreaterThan(Date value) {
            addCriterion("DZ_DD >", value, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdGreaterThanOrEqualTo(Date value) {
            addCriterion("DZ_DD >=", value, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdLessThan(Date value) {
            addCriterion("DZ_DD <", value, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdLessThanOrEqualTo(Date value) {
            addCriterion("DZ_DD <=", value, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdIn(List<Date> values) {
            addCriterion("DZ_DD in", values, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdNotIn(List<Date> values) {
            addCriterion("DZ_DD not in", values, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdBetween(Date value1, Date value2) {
            addCriterion("DZ_DD between", value1, value2, "dzDd");
            return (Criteria) this;
        }

        public Criteria andDzDdNotBetween(Date value1, Date value2) {
            addCriterion("DZ_DD not between", value1, value2, "dzDd");
            return (Criteria) this;
        }

        public Criteria andBzDataIsNull() {
            addCriterion("BZ_DATA is null");
            return (Criteria) this;
        }

        public Criteria andBzDataIsNotNull() {
            addCriterion("BZ_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andBzDataEqualTo(String value) {
            addCriterion("BZ_DATA =", value, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataNotEqualTo(String value) {
            addCriterion("BZ_DATA <>", value, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataGreaterThan(String value) {
            addCriterion("BZ_DATA >", value, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataGreaterThanOrEqualTo(String value) {
            addCriterion("BZ_DATA >=", value, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataLessThan(String value) {
            addCriterion("BZ_DATA <", value, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataLessThanOrEqualTo(String value) {
            addCriterion("BZ_DATA <=", value, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataLike(String value) {
            addCriterion("BZ_DATA like", value, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataNotLike(String value) {
            addCriterion("BZ_DATA not like", value, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataIn(List<String> values) {
            addCriterion("BZ_DATA in", values, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataNotIn(List<String> values) {
            addCriterion("BZ_DATA not in", values, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataBetween(String value1, String value2) {
            addCriterion("BZ_DATA between", value1, value2, "bzData");
            return (Criteria) this;
        }

        public Criteria andBzDataNotBetween(String value1, String value2) {
            addCriterion("BZ_DATA not between", value1, value2, "bzData");
            return (Criteria) this;
        }

        public Criteria andRtoIdIsNull() {
            addCriterion("RTO_ID is null");
            return (Criteria) this;
        }

        public Criteria andRtoIdIsNotNull() {
            addCriterion("RTO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRtoIdEqualTo(String value) {
            addCriterion("RTO_ID =", value, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdNotEqualTo(String value) {
            addCriterion("RTO_ID <>", value, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdGreaterThan(String value) {
            addCriterion("RTO_ID >", value, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdGreaterThanOrEqualTo(String value) {
            addCriterion("RTO_ID >=", value, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdLessThan(String value) {
            addCriterion("RTO_ID <", value, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdLessThanOrEqualTo(String value) {
            addCriterion("RTO_ID <=", value, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdLike(String value) {
            addCriterion("RTO_ID like", value, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdNotLike(String value) {
            addCriterion("RTO_ID not like", value, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdIn(List<String> values) {
            addCriterion("RTO_ID in", values, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdNotIn(List<String> values) {
            addCriterion("RTO_ID not in", values, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdBetween(String value1, String value2) {
            addCriterion("RTO_ID between", value1, value2, "rtoId");
            return (Criteria) this;
        }

        public Criteria andRtoIdNotBetween(String value1, String value2) {
            addCriterion("RTO_ID not between", value1, value2, "rtoId");
            return (Criteria) this;
        }

        public Criteria andXnNoIsNull() {
            addCriterion("XN_NO is null");
            return (Criteria) this;
        }

        public Criteria andXnNoIsNotNull() {
            addCriterion("XN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andXnNoEqualTo(String value) {
            addCriterion("XN_NO =", value, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoNotEqualTo(String value) {
            addCriterion("XN_NO <>", value, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoGreaterThan(String value) {
            addCriterion("XN_NO >", value, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoGreaterThanOrEqualTo(String value) {
            addCriterion("XN_NO >=", value, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoLessThan(String value) {
            addCriterion("XN_NO <", value, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoLessThanOrEqualTo(String value) {
            addCriterion("XN_NO <=", value, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoLike(String value) {
            addCriterion("XN_NO like", value, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoNotLike(String value) {
            addCriterion("XN_NO not like", value, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoIn(List<String> values) {
            addCriterion("XN_NO in", values, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoNotIn(List<String> values) {
            addCriterion("XN_NO not in", values, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoBetween(String value1, String value2) {
            addCriterion("XN_NO between", value1, value2, "xnNo");
            return (Criteria) this;
        }

        public Criteria andXnNoNotBetween(String value1, String value2) {
            addCriterion("XN_NO not between", value1, value2, "xnNo");
            return (Criteria) this;
        }

        public Criteria andChkRtnIsNull() {
            addCriterion("CHK_RTN is null");
            return (Criteria) this;
        }

        public Criteria andChkRtnIsNotNull() {
            addCriterion("CHK_RTN is not null");
            return (Criteria) this;
        }

        public Criteria andChkRtnEqualTo(String value) {
            addCriterion("CHK_RTN =", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnNotEqualTo(String value) {
            addCriterion("CHK_RTN <>", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnGreaterThan(String value) {
            addCriterion("CHK_RTN >", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_RTN >=", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnLessThan(String value) {
            addCriterion("CHK_RTN <", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnLessThanOrEqualTo(String value) {
            addCriterion("CHK_RTN <=", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnLike(String value) {
            addCriterion("CHK_RTN like", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnNotLike(String value) {
            addCriterion("CHK_RTN not like", value, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnIn(List<String> values) {
            addCriterion("CHK_RTN in", values, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnNotIn(List<String> values) {
            addCriterion("CHK_RTN not in", values, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnBetween(String value1, String value2) {
            addCriterion("CHK_RTN between", value1, value2, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkRtnNotBetween(String value1, String value2) {
            addCriterion("CHK_RTN not between", value1, value2, "chkRtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnIsNull() {
            addCriterion("CHK_MTN is null");
            return (Criteria) this;
        }

        public Criteria andChkMtnIsNotNull() {
            addCriterion("CHK_MTN is not null");
            return (Criteria) this;
        }

        public Criteria andChkMtnEqualTo(String value) {
            addCriterion("CHK_MTN =", value, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnNotEqualTo(String value) {
            addCriterion("CHK_MTN <>", value, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnGreaterThan(String value) {
            addCriterion("CHK_MTN >", value, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MTN >=", value, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnLessThan(String value) {
            addCriterion("CHK_MTN <", value, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnLessThanOrEqualTo(String value) {
            addCriterion("CHK_MTN <=", value, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnLike(String value) {
            addCriterion("CHK_MTN like", value, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnNotLike(String value) {
            addCriterion("CHK_MTN not like", value, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnIn(List<String> values) {
            addCriterion("CHK_MTN in", values, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnNotIn(List<String> values) {
            addCriterion("CHK_MTN not in", values, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnBetween(String value1, String value2) {
            addCriterion("CHK_MTN between", value1, value2, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkMtnNotBetween(String value1, String value2) {
            addCriterion("CHK_MTN not between", value1, value2, "chkMtn");
            return (Criteria) this;
        }

        public Criteria andChkInstallIsNull() {
            addCriterion("CHK_INSTALL is null");
            return (Criteria) this;
        }

        public Criteria andChkInstallIsNotNull() {
            addCriterion("CHK_INSTALL is not null");
            return (Criteria) this;
        }

        public Criteria andChkInstallEqualTo(String value) {
            addCriterion("CHK_INSTALL =", value, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallNotEqualTo(String value) {
            addCriterion("CHK_INSTALL <>", value, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallGreaterThan(String value) {
            addCriterion("CHK_INSTALL >", value, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_INSTALL >=", value, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallLessThan(String value) {
            addCriterion("CHK_INSTALL <", value, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallLessThanOrEqualTo(String value) {
            addCriterion("CHK_INSTALL <=", value, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallLike(String value) {
            addCriterion("CHK_INSTALL like", value, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallNotLike(String value) {
            addCriterion("CHK_INSTALL not like", value, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallIn(List<String> values) {
            addCriterion("CHK_INSTALL in", values, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallNotIn(List<String> values) {
            addCriterion("CHK_INSTALL not in", values, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallBetween(String value1, String value2) {
            addCriterion("CHK_INSTALL between", value1, value2, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andChkInstallNotBetween(String value1, String value2) {
            addCriterion("CHK_INSTALL not between", value1, value2, "chkInstall");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeIsNull() {
            addCriterion("MTN_LTIME is null");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeIsNotNull() {
            addCriterion("MTN_LTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeEqualTo(Integer value) {
            addCriterion("MTN_LTIME =", value, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeNotEqualTo(Integer value) {
            addCriterion("MTN_LTIME <>", value, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeGreaterThan(Integer value) {
            addCriterion("MTN_LTIME >", value, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MTN_LTIME >=", value, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeLessThan(Integer value) {
            addCriterion("MTN_LTIME <", value, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeLessThanOrEqualTo(Integer value) {
            addCriterion("MTN_LTIME <=", value, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeIn(List<Integer> values) {
            addCriterion("MTN_LTIME in", values, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeNotIn(List<Integer> values) {
            addCriterion("MTN_LTIME not in", values, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeBetween(Integer value1, Integer value2) {
            addCriterion("MTN_LTIME between", value1, value2, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andMtnLtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("MTN_LTIME not between", value1, value2, "mtnLtime");
            return (Criteria) this;
        }

        public Criteria andChkPcIsNull() {
            addCriterion("CHK_PC is null");
            return (Criteria) this;
        }

        public Criteria andChkPcIsNotNull() {
            addCriterion("CHK_PC is not null");
            return (Criteria) this;
        }

        public Criteria andChkPcEqualTo(String value) {
            addCriterion("CHK_PC =", value, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcNotEqualTo(String value) {
            addCriterion("CHK_PC <>", value, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcGreaterThan(String value) {
            addCriterion("CHK_PC >", value, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_PC >=", value, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcLessThan(String value) {
            addCriterion("CHK_PC <", value, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcLessThanOrEqualTo(String value) {
            addCriterion("CHK_PC <=", value, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcLike(String value) {
            addCriterion("CHK_PC like", value, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcNotLike(String value) {
            addCriterion("CHK_PC not like", value, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcIn(List<String> values) {
            addCriterion("CHK_PC in", values, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcNotIn(List<String> values) {
            addCriterion("CHK_PC not in", values, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcBetween(String value1, String value2) {
            addCriterion("CHK_PC between", value1, value2, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkPcNotBetween(String value1, String value2) {
            addCriterion("CHK_PC not between", value1, value2, "chkPc");
            return (Criteria) this;
        }

        public Criteria andChkTwIsNull() {
            addCriterion("CHK_TW is null");
            return (Criteria) this;
        }

        public Criteria andChkTwIsNotNull() {
            addCriterion("CHK_TW is not null");
            return (Criteria) this;
        }

        public Criteria andChkTwEqualTo(String value) {
            addCriterion("CHK_TW =", value, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwNotEqualTo(String value) {
            addCriterion("CHK_TW <>", value, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwGreaterThan(String value) {
            addCriterion("CHK_TW >", value, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_TW >=", value, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwLessThan(String value) {
            addCriterion("CHK_TW <", value, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwLessThanOrEqualTo(String value) {
            addCriterion("CHK_TW <=", value, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwLike(String value) {
            addCriterion("CHK_TW like", value, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwNotLike(String value) {
            addCriterion("CHK_TW not like", value, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwIn(List<String> values) {
            addCriterion("CHK_TW in", values, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwNotIn(List<String> values) {
            addCriterion("CHK_TW not in", values, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwBetween(String value1, String value2) {
            addCriterion("CHK_TW between", value1, value2, "chkTw");
            return (Criteria) this;
        }

        public Criteria andChkTwNotBetween(String value1, String value2) {
            addCriterion("CHK_TW not between", value1, value2, "chkTw");
            return (Criteria) this;
        }

        public Criteria andStopProdIsNull() {
            addCriterion("STOP_PROD is null");
            return (Criteria) this;
        }

        public Criteria andStopProdIsNotNull() {
            addCriterion("STOP_PROD is not null");
            return (Criteria) this;
        }

        public Criteria andStopProdEqualTo(String value) {
            addCriterion("STOP_PROD =", value, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdNotEqualTo(String value) {
            addCriterion("STOP_PROD <>", value, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdGreaterThan(String value) {
            addCriterion("STOP_PROD >", value, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdGreaterThanOrEqualTo(String value) {
            addCriterion("STOP_PROD >=", value, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdLessThan(String value) {
            addCriterion("STOP_PROD <", value, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdLessThanOrEqualTo(String value) {
            addCriterion("STOP_PROD <=", value, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdLike(String value) {
            addCriterion("STOP_PROD like", value, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdNotLike(String value) {
            addCriterion("STOP_PROD not like", value, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdIn(List<String> values) {
            addCriterion("STOP_PROD in", values, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdNotIn(List<String> values) {
            addCriterion("STOP_PROD not in", values, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdBetween(String value1, String value2) {
            addCriterion("STOP_PROD between", value1, value2, "stopProd");
            return (Criteria) this;
        }

        public Criteria andStopProdNotBetween(String value1, String value2) {
            addCriterion("STOP_PROD not between", value1, value2, "stopProd");
            return (Criteria) this;
        }

        public Criteria andVirtualIdIsNull() {
            addCriterion("VIRTUAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andVirtualIdIsNotNull() {
            addCriterion("VIRTUAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualIdEqualTo(String value) {
            addCriterion("VIRTUAL_ID =", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdNotEqualTo(String value) {
            addCriterion("VIRTUAL_ID <>", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdGreaterThan(String value) {
            addCriterion("VIRTUAL_ID >", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdGreaterThanOrEqualTo(String value) {
            addCriterion("VIRTUAL_ID >=", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdLessThan(String value) {
            addCriterion("VIRTUAL_ID <", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdLessThanOrEqualTo(String value) {
            addCriterion("VIRTUAL_ID <=", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdLike(String value) {
            addCriterion("VIRTUAL_ID like", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdNotLike(String value) {
            addCriterion("VIRTUAL_ID not like", value, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdIn(List<String> values) {
            addCriterion("VIRTUAL_ID in", values, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdNotIn(List<String> values) {
            addCriterion("VIRTUAL_ID not in", values, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdBetween(String value1, String value2) {
            addCriterion("VIRTUAL_ID between", value1, value2, "virtualId");
            return (Criteria) this;
        }

        public Criteria andVirtualIdNotBetween(String value1, String value2) {
            addCriterion("VIRTUAL_ID not between", value1, value2, "virtualId");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andB2cHideIsNull() {
            addCriterion("B2C_HIDE is null");
            return (Criteria) this;
        }

        public Criteria andB2cHideIsNotNull() {
            addCriterion("B2C_HIDE is not null");
            return (Criteria) this;
        }

        public Criteria andB2cHideEqualTo(String value) {
            addCriterion("B2C_HIDE =", value, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideNotEqualTo(String value) {
            addCriterion("B2C_HIDE <>", value, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideGreaterThan(String value) {
            addCriterion("B2C_HIDE >", value, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideGreaterThanOrEqualTo(String value) {
            addCriterion("B2C_HIDE >=", value, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideLessThan(String value) {
            addCriterion("B2C_HIDE <", value, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideLessThanOrEqualTo(String value) {
            addCriterion("B2C_HIDE <=", value, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideLike(String value) {
            addCriterion("B2C_HIDE like", value, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideNotLike(String value) {
            addCriterion("B2C_HIDE not like", value, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideIn(List<String> values) {
            addCriterion("B2C_HIDE in", values, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideNotIn(List<String> values) {
            addCriterion("B2C_HIDE not in", values, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideBetween(String value1, String value2) {
            addCriterion("B2C_HIDE between", value1, value2, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andB2cHideNotBetween(String value1, String value2) {
            addCriterion("B2C_HIDE not between", value1, value2, "b2cHide");
            return (Criteria) this;
        }

        public Criteria andWebTitleIsNull() {
            addCriterion("WEB_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andWebTitleIsNotNull() {
            addCriterion("WEB_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andWebTitleEqualTo(String value) {
            addCriterion("WEB_TITLE =", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleNotEqualTo(String value) {
            addCriterion("WEB_TITLE <>", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleGreaterThan(String value) {
            addCriterion("WEB_TITLE >", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_TITLE >=", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleLessThan(String value) {
            addCriterion("WEB_TITLE <", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleLessThanOrEqualTo(String value) {
            addCriterion("WEB_TITLE <=", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleLike(String value) {
            addCriterion("WEB_TITLE like", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleNotLike(String value) {
            addCriterion("WEB_TITLE not like", value, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleIn(List<String> values) {
            addCriterion("WEB_TITLE in", values, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleNotIn(List<String> values) {
            addCriterion("WEB_TITLE not in", values, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleBetween(String value1, String value2) {
            addCriterion("WEB_TITLE between", value1, value2, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebTitleNotBetween(String value1, String value2) {
            addCriterion("WEB_TITLE not between", value1, value2, "webTitle");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionIsNull() {
            addCriterion("WEB_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionIsNotNull() {
            addCriterion("WEB_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionEqualTo(String value) {
            addCriterion("WEB_DESCRIPTION =", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionNotEqualTo(String value) {
            addCriterion("WEB_DESCRIPTION <>", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionGreaterThan(String value) {
            addCriterion("WEB_DESCRIPTION >", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_DESCRIPTION >=", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionLessThan(String value) {
            addCriterion("WEB_DESCRIPTION <", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionLessThanOrEqualTo(String value) {
            addCriterion("WEB_DESCRIPTION <=", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionLike(String value) {
            addCriterion("WEB_DESCRIPTION like", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionNotLike(String value) {
            addCriterion("WEB_DESCRIPTION not like", value, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionIn(List<String> values) {
            addCriterion("WEB_DESCRIPTION in", values, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionNotIn(List<String> values) {
            addCriterion("WEB_DESCRIPTION not in", values, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionBetween(String value1, String value2) {
            addCriterion("WEB_DESCRIPTION between", value1, value2, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebDescriptionNotBetween(String value1, String value2) {
            addCriterion("WEB_DESCRIPTION not between", value1, value2, "webDescription");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsIsNull() {
            addCriterion("WEB_KEYWORDS is null");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsIsNotNull() {
            addCriterion("WEB_KEYWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsEqualTo(String value) {
            addCriterion("WEB_KEYWORDS =", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsNotEqualTo(String value) {
            addCriterion("WEB_KEYWORDS <>", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsGreaterThan(String value) {
            addCriterion("WEB_KEYWORDS >", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_KEYWORDS >=", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsLessThan(String value) {
            addCriterion("WEB_KEYWORDS <", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsLessThanOrEqualTo(String value) {
            addCriterion("WEB_KEYWORDS <=", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsLike(String value) {
            addCriterion("WEB_KEYWORDS like", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsNotLike(String value) {
            addCriterion("WEB_KEYWORDS not like", value, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsIn(List<String> values) {
            addCriterion("WEB_KEYWORDS in", values, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsNotIn(List<String> values) {
            addCriterion("WEB_KEYWORDS not in", values, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsBetween(String value1, String value2) {
            addCriterion("WEB_KEYWORDS between", value1, value2, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andWebKeywordsNotBetween(String value1, String value2) {
            addCriterion("WEB_KEYWORDS not between", value1, value2, "webKeywords");
            return (Criteria) this;
        }

        public Criteria andCadnameIsNull() {
            addCriterion("CADNAME is null");
            return (Criteria) this;
        }

        public Criteria andCadnameIsNotNull() {
            addCriterion("CADNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCadnameEqualTo(String value) {
            addCriterion("CADNAME =", value, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameNotEqualTo(String value) {
            addCriterion("CADNAME <>", value, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameGreaterThan(String value) {
            addCriterion("CADNAME >", value, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameGreaterThanOrEqualTo(String value) {
            addCriterion("CADNAME >=", value, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameLessThan(String value) {
            addCriterion("CADNAME <", value, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameLessThanOrEqualTo(String value) {
            addCriterion("CADNAME <=", value, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameLike(String value) {
            addCriterion("CADNAME like", value, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameNotLike(String value) {
            addCriterion("CADNAME not like", value, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameIn(List<String> values) {
            addCriterion("CADNAME in", values, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameNotIn(List<String> values) {
            addCriterion("CADNAME not in", values, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameBetween(String value1, String value2) {
            addCriterion("CADNAME between", value1, value2, "cadname");
            return (Criteria) this;
        }

        public Criteria andCadnameNotBetween(String value1, String value2) {
            addCriterion("CADNAME not between", value1, value2, "cadname");
            return (Criteria) this;
        }

        public Criteria andQtyMin1IsNull() {
            addCriterion("QTY_MIN1 is null");
            return (Criteria) this;
        }

        public Criteria andQtyMin1IsNotNull() {
            addCriterion("QTY_MIN1 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyMin1EqualTo(BigDecimal value) {
            addCriterion("QTY_MIN1 =", value, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1NotEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN1 <>", value, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1GreaterThan(BigDecimal value) {
            addCriterion("QTY_MIN1 >", value, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN1 >=", value, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1LessThan(BigDecimal value) {
            addCriterion("QTY_MIN1 <", value, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN1 <=", value, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1In(List<BigDecimal> values) {
            addCriterion("QTY_MIN1 in", values, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1NotIn(List<BigDecimal> values) {
            addCriterion("QTY_MIN1 not in", values, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MIN1 between", value1, value2, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMin1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MIN1 not between", value1, value2, "qtyMin1");
            return (Criteria) this;
        }

        public Criteria andQtyMaxIsNull() {
            addCriterion("QTY_MAX is null");
            return (Criteria) this;
        }

        public Criteria andQtyMaxIsNotNull() {
            addCriterion("QTY_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andQtyMaxEqualTo(BigDecimal value) {
            addCriterion("QTY_MAX =", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxNotEqualTo(BigDecimal value) {
            addCriterion("QTY_MAX <>", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxGreaterThan(BigDecimal value) {
            addCriterion("QTY_MAX >", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MAX >=", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxLessThan(BigDecimal value) {
            addCriterion("QTY_MAX <", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MAX <=", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxIn(List<BigDecimal> values) {
            addCriterion("QTY_MAX in", values, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxNotIn(List<BigDecimal> values) {
            addCriterion("QTY_MAX not in", values, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MAX between", value1, value2, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MAX not between", value1, value2, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andTlIdIsNull() {
            addCriterion("TL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTlIdIsNotNull() {
            addCriterion("TL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTlIdEqualTo(String value) {
            addCriterion("TL_ID =", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdNotEqualTo(String value) {
            addCriterion("TL_ID <>", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdGreaterThan(String value) {
            addCriterion("TL_ID >", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdGreaterThanOrEqualTo(String value) {
            addCriterion("TL_ID >=", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdLessThan(String value) {
            addCriterion("TL_ID <", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdLessThanOrEqualTo(String value) {
            addCriterion("TL_ID <=", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdLike(String value) {
            addCriterion("TL_ID like", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdNotLike(String value) {
            addCriterion("TL_ID not like", value, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdIn(List<String> values) {
            addCriterion("TL_ID in", values, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdNotIn(List<String> values) {
            addCriterion("TL_ID not in", values, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdBetween(String value1, String value2) {
            addCriterion("TL_ID between", value1, value2, "tlId");
            return (Criteria) this;
        }

        public Criteria andTlIdNotBetween(String value1, String value2) {
            addCriterion("TL_ID not between", value1, value2, "tlId");
            return (Criteria) this;
        }

        public Criteria andSaRtoIsNull() {
            addCriterion("SA_RTO is null");
            return (Criteria) this;
        }

        public Criteria andSaRtoIsNotNull() {
            addCriterion("SA_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andSaRtoEqualTo(BigDecimal value) {
            addCriterion("SA_RTO =", value, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoNotEqualTo(BigDecimal value) {
            addCriterion("SA_RTO <>", value, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoGreaterThan(BigDecimal value) {
            addCriterion("SA_RTO >", value, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SA_RTO >=", value, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoLessThan(BigDecimal value) {
            addCriterion("SA_RTO <", value, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SA_RTO <=", value, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoIn(List<BigDecimal> values) {
            addCriterion("SA_RTO in", values, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoNotIn(List<BigDecimal> values) {
            addCriterion("SA_RTO not in", values, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SA_RTO between", value1, value2, "saRto");
            return (Criteria) this;
        }

        public Criteria andSaRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SA_RTO not between", value1, value2, "saRto");
            return (Criteria) this;
        }

        public Criteria andDeproNoIsNull() {
            addCriterion("DEPRO_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeproNoIsNotNull() {
            addCriterion("DEPRO_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeproNoEqualTo(String value) {
            addCriterion("DEPRO_NO =", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoNotEqualTo(String value) {
            addCriterion("DEPRO_NO <>", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoGreaterThan(String value) {
            addCriterion("DEPRO_NO >", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEPRO_NO >=", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoLessThan(String value) {
            addCriterion("DEPRO_NO <", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoLessThanOrEqualTo(String value) {
            addCriterion("DEPRO_NO <=", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoLike(String value) {
            addCriterion("DEPRO_NO like", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoNotLike(String value) {
            addCriterion("DEPRO_NO not like", value, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoIn(List<String> values) {
            addCriterion("DEPRO_NO in", values, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoNotIn(List<String> values) {
            addCriterion("DEPRO_NO not in", values, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoBetween(String value1, String value2) {
            addCriterion("DEPRO_NO between", value1, value2, "deproNo");
            return (Criteria) this;
        }

        public Criteria andDeproNoNotBetween(String value1, String value2) {
            addCriterion("DEPRO_NO not between", value1, value2, "deproNo");
            return (Criteria) this;
        }

        public Criteria andCcNoIsNull() {
            addCriterion("CC_NO is null");
            return (Criteria) this;
        }

        public Criteria andCcNoIsNotNull() {
            addCriterion("CC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCcNoEqualTo(String value) {
            addCriterion("CC_NO =", value, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoNotEqualTo(String value) {
            addCriterion("CC_NO <>", value, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoGreaterThan(String value) {
            addCriterion("CC_NO >", value, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoGreaterThanOrEqualTo(String value) {
            addCriterion("CC_NO >=", value, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoLessThan(String value) {
            addCriterion("CC_NO <", value, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoLessThanOrEqualTo(String value) {
            addCriterion("CC_NO <=", value, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoLike(String value) {
            addCriterion("CC_NO like", value, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoNotLike(String value) {
            addCriterion("CC_NO not like", value, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoIn(List<String> values) {
            addCriterion("CC_NO in", values, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoNotIn(List<String> values) {
            addCriterion("CC_NO not in", values, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoBetween(String value1, String value2) {
            addCriterion("CC_NO between", value1, value2, "ccNo");
            return (Criteria) this;
        }

        public Criteria andCcNoNotBetween(String value1, String value2) {
            addCriterion("CC_NO not between", value1, value2, "ccNo");
            return (Criteria) this;
        }

        public Criteria andRtoPcIsNull() {
            addCriterion("RTO_PC is null");
            return (Criteria) this;
        }

        public Criteria andRtoPcIsNotNull() {
            addCriterion("RTO_PC is not null");
            return (Criteria) this;
        }

        public Criteria andRtoPcEqualTo(BigDecimal value) {
            addCriterion("RTO_PC =", value, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcNotEqualTo(BigDecimal value) {
            addCriterion("RTO_PC <>", value, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcGreaterThan(BigDecimal value) {
            addCriterion("RTO_PC >", value, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_PC >=", value, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcLessThan(BigDecimal value) {
            addCriterion("RTO_PC <", value, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_PC <=", value, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcIn(List<BigDecimal> values) {
            addCriterion("RTO_PC in", values, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcNotIn(List<BigDecimal> values) {
            addCriterion("RTO_PC not in", values, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_PC between", value1, value2, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoPcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_PC not between", value1, value2, "rtoPc");
            return (Criteria) this;
        }

        public Criteria andRtoSaIsNull() {
            addCriterion("RTO_SA is null");
            return (Criteria) this;
        }

        public Criteria andRtoSaIsNotNull() {
            addCriterion("RTO_SA is not null");
            return (Criteria) this;
        }

        public Criteria andRtoSaEqualTo(BigDecimal value) {
            addCriterion("RTO_SA =", value, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaNotEqualTo(BigDecimal value) {
            addCriterion("RTO_SA <>", value, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaGreaterThan(BigDecimal value) {
            addCriterion("RTO_SA >", value, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_SA >=", value, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaLessThan(BigDecimal value) {
            addCriterion("RTO_SA <", value, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_SA <=", value, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaIn(List<BigDecimal> values) {
            addCriterion("RTO_SA in", values, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaNotIn(List<BigDecimal> values) {
            addCriterion("RTO_SA not in", values, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_SA between", value1, value2, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoSaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_SA not between", value1, value2, "rtoSa");
            return (Criteria) this;
        }

        public Criteria andRtoMmIsNull() {
            addCriterion("RTO_MM is null");
            return (Criteria) this;
        }

        public Criteria andRtoMmIsNotNull() {
            addCriterion("RTO_MM is not null");
            return (Criteria) this;
        }

        public Criteria andRtoMmEqualTo(BigDecimal value) {
            addCriterion("RTO_MM =", value, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmNotEqualTo(BigDecimal value) {
            addCriterion("RTO_MM <>", value, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmGreaterThan(BigDecimal value) {
            addCriterion("RTO_MM >", value, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_MM >=", value, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmLessThan(BigDecimal value) {
            addCriterion("RTO_MM <", value, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_MM <=", value, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmIn(List<BigDecimal> values) {
            addCriterion("RTO_MM in", values, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmNotIn(List<BigDecimal> values) {
            addCriterion("RTO_MM not in", values, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_MM between", value1, value2, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoMmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_MM not between", value1, value2, "rtoMm");
            return (Criteria) this;
        }

        public Criteria andRtoTbIsNull() {
            addCriterion("RTO_TB is null");
            return (Criteria) this;
        }

        public Criteria andRtoTbIsNotNull() {
            addCriterion("RTO_TB is not null");
            return (Criteria) this;
        }

        public Criteria andRtoTbEqualTo(BigDecimal value) {
            addCriterion("RTO_TB =", value, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbNotEqualTo(BigDecimal value) {
            addCriterion("RTO_TB <>", value, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbGreaterThan(BigDecimal value) {
            addCriterion("RTO_TB >", value, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_TB >=", value, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbLessThan(BigDecimal value) {
            addCriterion("RTO_TB <", value, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_TB <=", value, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbIn(List<BigDecimal> values) {
            addCriterion("RTO_TB in", values, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbNotIn(List<BigDecimal> values) {
            addCriterion("RTO_TB not in", values, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_TB between", value1, value2, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andRtoTbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_TB not between", value1, value2, "rtoTb");
            return (Criteria) this;
        }

        public Criteria andMlByMmIsNull() {
            addCriterion("ML_BY_MM is null");
            return (Criteria) this;
        }

        public Criteria andMlByMmIsNotNull() {
            addCriterion("ML_BY_MM is not null");
            return (Criteria) this;
        }

        public Criteria andMlByMmEqualTo(String value) {
            addCriterion("ML_BY_MM =", value, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmNotEqualTo(String value) {
            addCriterion("ML_BY_MM <>", value, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmGreaterThan(String value) {
            addCriterion("ML_BY_MM >", value, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmGreaterThanOrEqualTo(String value) {
            addCriterion("ML_BY_MM >=", value, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmLessThan(String value) {
            addCriterion("ML_BY_MM <", value, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmLessThanOrEqualTo(String value) {
            addCriterion("ML_BY_MM <=", value, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmLike(String value) {
            addCriterion("ML_BY_MM like", value, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmNotLike(String value) {
            addCriterion("ML_BY_MM not like", value, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmIn(List<String> values) {
            addCriterion("ML_BY_MM in", values, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmNotIn(List<String> values) {
            addCriterion("ML_BY_MM not in", values, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmBetween(String value1, String value2) {
            addCriterion("ML_BY_MM between", value1, value2, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andMlByMmNotBetween(String value1, String value2) {
            addCriterion("ML_BY_MM not between", value1, value2, "mlByMm");
            return (Criteria) this;
        }

        public Criteria andTplNoIsNull() {
            addCriterion("TPL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTplNoIsNotNull() {
            addCriterion("TPL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTplNoEqualTo(String value) {
            addCriterion("TPL_NO =", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoNotEqualTo(String value) {
            addCriterion("TPL_NO <>", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoGreaterThan(String value) {
            addCriterion("TPL_NO >", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoGreaterThanOrEqualTo(String value) {
            addCriterion("TPL_NO >=", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoLessThan(String value) {
            addCriterion("TPL_NO <", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoLessThanOrEqualTo(String value) {
            addCriterion("TPL_NO <=", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoLike(String value) {
            addCriterion("TPL_NO like", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoNotLike(String value) {
            addCriterion("TPL_NO not like", value, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoIn(List<String> values) {
            addCriterion("TPL_NO in", values, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoNotIn(List<String> values) {
            addCriterion("TPL_NO not in", values, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoBetween(String value1, String value2) {
            addCriterion("TPL_NO between", value1, value2, "tplNo");
            return (Criteria) this;
        }

        public Criteria andTplNoNotBetween(String value1, String value2) {
            addCriterion("TPL_NO not between", value1, value2, "tplNo");
            return (Criteria) this;
        }

        public Criteria andChkSaIsNull() {
            addCriterion("CHK_SA is null");
            return (Criteria) this;
        }

        public Criteria andChkSaIsNotNull() {
            addCriterion("CHK_SA is not null");
            return (Criteria) this;
        }

        public Criteria andChkSaEqualTo(String value) {
            addCriterion("CHK_SA =", value, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaNotEqualTo(String value) {
            addCriterion("CHK_SA <>", value, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaGreaterThan(String value) {
            addCriterion("CHK_SA >", value, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_SA >=", value, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaLessThan(String value) {
            addCriterion("CHK_SA <", value, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaLessThanOrEqualTo(String value) {
            addCriterion("CHK_SA <=", value, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaLike(String value) {
            addCriterion("CHK_SA like", value, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaNotLike(String value) {
            addCriterion("CHK_SA not like", value, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaIn(List<String> values) {
            addCriterion("CHK_SA in", values, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaNotIn(List<String> values) {
            addCriterion("CHK_SA not in", values, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaBetween(String value1, String value2) {
            addCriterion("CHK_SA between", value1, value2, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSaNotBetween(String value1, String value2) {
            addCriterion("CHK_SA not between", value1, value2, "chkSa");
            return (Criteria) this;
        }

        public Criteria andChkSbIsNull() {
            addCriterion("CHK_SB is null");
            return (Criteria) this;
        }

        public Criteria andChkSbIsNotNull() {
            addCriterion("CHK_SB is not null");
            return (Criteria) this;
        }

        public Criteria andChkSbEqualTo(String value) {
            addCriterion("CHK_SB =", value, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbNotEqualTo(String value) {
            addCriterion("CHK_SB <>", value, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbGreaterThan(String value) {
            addCriterion("CHK_SB >", value, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_SB >=", value, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbLessThan(String value) {
            addCriterion("CHK_SB <", value, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbLessThanOrEqualTo(String value) {
            addCriterion("CHK_SB <=", value, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbLike(String value) {
            addCriterion("CHK_SB like", value, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbNotLike(String value) {
            addCriterion("CHK_SB not like", value, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbIn(List<String> values) {
            addCriterion("CHK_SB in", values, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbNotIn(List<String> values) {
            addCriterion("CHK_SB not in", values, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbBetween(String value1, String value2) {
            addCriterion("CHK_SB between", value1, value2, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkSbNotBetween(String value1, String value2) {
            addCriterion("CHK_SB not between", value1, value2, "chkSb");
            return (Criteria) this;
        }

        public Criteria andChkMmIsNull() {
            addCriterion("CHK_MM is null");
            return (Criteria) this;
        }

        public Criteria andChkMmIsNotNull() {
            addCriterion("CHK_MM is not null");
            return (Criteria) this;
        }

        public Criteria andChkMmEqualTo(String value) {
            addCriterion("CHK_MM =", value, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmNotEqualTo(String value) {
            addCriterion("CHK_MM <>", value, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmGreaterThan(String value) {
            addCriterion("CHK_MM >", value, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MM >=", value, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmLessThan(String value) {
            addCriterion("CHK_MM <", value, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmLessThanOrEqualTo(String value) {
            addCriterion("CHK_MM <=", value, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmLike(String value) {
            addCriterion("CHK_MM like", value, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmNotLike(String value) {
            addCriterion("CHK_MM not like", value, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmIn(List<String> values) {
            addCriterion("CHK_MM in", values, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmNotIn(List<String> values) {
            addCriterion("CHK_MM not in", values, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmBetween(String value1, String value2) {
            addCriterion("CHK_MM between", value1, value2, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMmNotBetween(String value1, String value2) {
            addCriterion("CHK_MM not between", value1, value2, "chkMm");
            return (Criteria) this;
        }

        public Criteria andChkMlIsNull() {
            addCriterion("CHK_ML is null");
            return (Criteria) this;
        }

        public Criteria andChkMlIsNotNull() {
            addCriterion("CHK_ML is not null");
            return (Criteria) this;
        }

        public Criteria andChkMlEqualTo(String value) {
            addCriterion("CHK_ML =", value, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlNotEqualTo(String value) {
            addCriterion("CHK_ML <>", value, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlGreaterThan(String value) {
            addCriterion("CHK_ML >", value, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_ML >=", value, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlLessThan(String value) {
            addCriterion("CHK_ML <", value, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlLessThanOrEqualTo(String value) {
            addCriterion("CHK_ML <=", value, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlLike(String value) {
            addCriterion("CHK_ML like", value, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlNotLike(String value) {
            addCriterion("CHK_ML not like", value, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlIn(List<String> values) {
            addCriterion("CHK_ML in", values, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlNotIn(List<String> values) {
            addCriterion("CHK_ML not in", values, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlBetween(String value1, String value2) {
            addCriterion("CHK_ML between", value1, value2, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkMlNotBetween(String value1, String value2) {
            addCriterion("CHK_ML not between", value1, value2, "chkMl");
            return (Criteria) this;
        }

        public Criteria andChkM2IsNull() {
            addCriterion("CHK_M2 is null");
            return (Criteria) this;
        }

        public Criteria andChkM2IsNotNull() {
            addCriterion("CHK_M2 is not null");
            return (Criteria) this;
        }

        public Criteria andChkM2EqualTo(String value) {
            addCriterion("CHK_M2 =", value, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2NotEqualTo(String value) {
            addCriterion("CHK_M2 <>", value, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2GreaterThan(String value) {
            addCriterion("CHK_M2 >", value, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2GreaterThanOrEqualTo(String value) {
            addCriterion("CHK_M2 >=", value, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2LessThan(String value) {
            addCriterion("CHK_M2 <", value, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2LessThanOrEqualTo(String value) {
            addCriterion("CHK_M2 <=", value, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2Like(String value) {
            addCriterion("CHK_M2 like", value, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2NotLike(String value) {
            addCriterion("CHK_M2 not like", value, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2In(List<String> values) {
            addCriterion("CHK_M2 in", values, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2NotIn(List<String> values) {
            addCriterion("CHK_M2 not in", values, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2Between(String value1, String value2) {
            addCriterion("CHK_M2 between", value1, value2, "chkM2");
            return (Criteria) this;
        }

        public Criteria andChkM2NotBetween(String value1, String value2) {
            addCriterion("CHK_M2 not between", value1, value2, "chkM2");
            return (Criteria) this;
        }

        public Criteria andRemNameIsNull() {
            addCriterion("REM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRemNameIsNotNull() {
            addCriterion("REM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRemNameEqualTo(String value) {
            addCriterion("REM_NAME =", value, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameNotEqualTo(String value) {
            addCriterion("REM_NAME <>", value, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameGreaterThan(String value) {
            addCriterion("REM_NAME >", value, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameGreaterThanOrEqualTo(String value) {
            addCriterion("REM_NAME >=", value, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameLessThan(String value) {
            addCriterion("REM_NAME <", value, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameLessThanOrEqualTo(String value) {
            addCriterion("REM_NAME <=", value, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameLike(String value) {
            addCriterion("REM_NAME like", value, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameNotLike(String value) {
            addCriterion("REM_NAME not like", value, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameIn(List<String> values) {
            addCriterion("REM_NAME in", values, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameNotIn(List<String> values) {
            addCriterion("REM_NAME not in", values, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameBetween(String value1, String value2) {
            addCriterion("REM_NAME between", value1, value2, "remName");
            return (Criteria) this;
        }

        public Criteria andRemNameNotBetween(String value1, String value2) {
            addCriterion("REM_NAME not between", value1, value2, "remName");
            return (Criteria) this;
        }

        public Criteria andNamePyIsNull() {
            addCriterion("NAME_PY is null");
            return (Criteria) this;
        }

        public Criteria andNamePyIsNotNull() {
            addCriterion("NAME_PY is not null");
            return (Criteria) this;
        }

        public Criteria andNamePyEqualTo(String value) {
            addCriterion("NAME_PY =", value, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyNotEqualTo(String value) {
            addCriterion("NAME_PY <>", value, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyGreaterThan(String value) {
            addCriterion("NAME_PY >", value, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_PY >=", value, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyLessThan(String value) {
            addCriterion("NAME_PY <", value, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyLessThanOrEqualTo(String value) {
            addCriterion("NAME_PY <=", value, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyLike(String value) {
            addCriterion("NAME_PY like", value, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyNotLike(String value) {
            addCriterion("NAME_PY not like", value, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyIn(List<String> values) {
            addCriterion("NAME_PY in", values, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyNotIn(List<String> values) {
            addCriterion("NAME_PY not in", values, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyBetween(String value1, String value2) {
            addCriterion("NAME_PY between", value1, value2, "namePy");
            return (Criteria) this;
        }

        public Criteria andNamePyNotBetween(String value1, String value2) {
            addCriterion("NAME_PY not between", value1, value2, "namePy");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixIsNull() {
            addCriterion("QTY_LOST_FIX is null");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixIsNotNull() {
            addCriterion("QTY_LOST_FIX is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST_FIX =", value, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST_FIX <>", value, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOST_FIX >", value, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST_FIX >=", value, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixLessThan(BigDecimal value) {
            addCriterion("QTY_LOST_FIX <", value, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOST_FIX <=", value, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixIn(List<BigDecimal> values) {
            addCriterion("QTY_LOST_FIX in", values, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOST_FIX not in", values, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOST_FIX between", value1, value2, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andQtyLostFixNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOST_FIX not between", value1, value2, "qtyLostFix");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkIsNull() {
            addCriterion("USE_PRDMARK is null");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkIsNotNull() {
            addCriterion("USE_PRDMARK is not null");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkEqualTo(String value) {
            addCriterion("USE_PRDMARK =", value, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkNotEqualTo(String value) {
            addCriterion("USE_PRDMARK <>", value, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkGreaterThan(String value) {
            addCriterion("USE_PRDMARK >", value, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkGreaterThanOrEqualTo(String value) {
            addCriterion("USE_PRDMARK >=", value, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkLessThan(String value) {
            addCriterion("USE_PRDMARK <", value, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkLessThanOrEqualTo(String value) {
            addCriterion("USE_PRDMARK <=", value, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkLike(String value) {
            addCriterion("USE_PRDMARK like", value, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkNotLike(String value) {
            addCriterion("USE_PRDMARK not like", value, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkIn(List<String> values) {
            addCriterion("USE_PRDMARK in", values, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkNotIn(List<String> values) {
            addCriterion("USE_PRDMARK not in", values, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkBetween(String value1, String value2) {
            addCriterion("USE_PRDMARK between", value1, value2, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andUsePrdmarkNotBetween(String value1, String value2) {
            addCriterion("USE_PRDMARK not between", value1, value2, "usePrdmark");
            return (Criteria) this;
        }

        public Criteria andWcMonthIsNull() {
            addCriterion("WC_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andWcMonthIsNotNull() {
            addCriterion("WC_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andWcMonthEqualTo(Integer value) {
            addCriterion("WC_MONTH =", value, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthNotEqualTo(Integer value) {
            addCriterion("WC_MONTH <>", value, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthGreaterThan(Integer value) {
            addCriterion("WC_MONTH >", value, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("WC_MONTH >=", value, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthLessThan(Integer value) {
            addCriterion("WC_MONTH <", value, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthLessThanOrEqualTo(Integer value) {
            addCriterion("WC_MONTH <=", value, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthIn(List<Integer> values) {
            addCriterion("WC_MONTH in", values, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthNotIn(List<Integer> values) {
            addCriterion("WC_MONTH not in", values, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthBetween(Integer value1, Integer value2) {
            addCriterion("WC_MONTH between", value1, value2, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andWcMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("WC_MONTH not between", value1, value2, "wcMonth");
            return (Criteria) this;
        }

        public Criteria andChkAddWcIsNull() {
            addCriterion("CHK_ADD_WC is null");
            return (Criteria) this;
        }

        public Criteria andChkAddWcIsNotNull() {
            addCriterion("CHK_ADD_WC is not null");
            return (Criteria) this;
        }

        public Criteria andChkAddWcEqualTo(String value) {
            addCriterion("CHK_ADD_WC =", value, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcNotEqualTo(String value) {
            addCriterion("CHK_ADD_WC <>", value, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcGreaterThan(String value) {
            addCriterion("CHK_ADD_WC >", value, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_ADD_WC >=", value, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcLessThan(String value) {
            addCriterion("CHK_ADD_WC <", value, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcLessThanOrEqualTo(String value) {
            addCriterion("CHK_ADD_WC <=", value, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcLike(String value) {
            addCriterion("CHK_ADD_WC like", value, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcNotLike(String value) {
            addCriterion("CHK_ADD_WC not like", value, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcIn(List<String> values) {
            addCriterion("CHK_ADD_WC in", values, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcNotIn(List<String> values) {
            addCriterion("CHK_ADD_WC not in", values, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcBetween(String value1, String value2) {
            addCriterion("CHK_ADD_WC between", value1, value2, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andChkAddWcNotBetween(String value1, String value2) {
            addCriterion("CHK_ADD_WC not between", value1, value2, "chkAddWc");
            return (Criteria) this;
        }

        public Criteria andMobId1IsNull() {
            addCriterion("MOB_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andMobId1IsNotNull() {
            addCriterion("MOB_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andMobId1EqualTo(String value) {
            addCriterion("MOB_ID1 =", value, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1NotEqualTo(String value) {
            addCriterion("MOB_ID1 <>", value, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1GreaterThan(String value) {
            addCriterion("MOB_ID1 >", value, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1GreaterThanOrEqualTo(String value) {
            addCriterion("MOB_ID1 >=", value, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1LessThan(String value) {
            addCriterion("MOB_ID1 <", value, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1LessThanOrEqualTo(String value) {
            addCriterion("MOB_ID1 <=", value, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1Like(String value) {
            addCriterion("MOB_ID1 like", value, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1NotLike(String value) {
            addCriterion("MOB_ID1 not like", value, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1In(List<String> values) {
            addCriterion("MOB_ID1 in", values, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1NotIn(List<String> values) {
            addCriterion("MOB_ID1 not in", values, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1Between(String value1, String value2) {
            addCriterion("MOB_ID1 between", value1, value2, "mobId1");
            return (Criteria) this;
        }

        public Criteria andMobId1NotBetween(String value1, String value2) {
            addCriterion("MOB_ID1 not between", value1, value2, "mobId1");
            return (Criteria) this;
        }

        public Criteria andFyFlagIsNull() {
            addCriterion("FY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFyFlagIsNotNull() {
            addCriterion("FY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFyFlagEqualTo(String value) {
            addCriterion("FY_FLAG =", value, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagNotEqualTo(String value) {
            addCriterion("FY_FLAG <>", value, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagGreaterThan(String value) {
            addCriterion("FY_FLAG >", value, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FY_FLAG >=", value, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagLessThan(String value) {
            addCriterion("FY_FLAG <", value, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagLessThanOrEqualTo(String value) {
            addCriterion("FY_FLAG <=", value, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagLike(String value) {
            addCriterion("FY_FLAG like", value, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagNotLike(String value) {
            addCriterion("FY_FLAG not like", value, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagIn(List<String> values) {
            addCriterion("FY_FLAG in", values, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagNotIn(List<String> values) {
            addCriterion("FY_FLAG not in", values, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagBetween(String value1, String value2) {
            addCriterion("FY_FLAG between", value1, value2, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andFyFlagNotBetween(String value1, String value2) {
            addCriterion("FY_FLAG not between", value1, value2, "fyFlag");
            return (Criteria) this;
        }

        public Criteria andAccNoFcIsNull() {
            addCriterion("ACC_NO_FC is null");
            return (Criteria) this;
        }

        public Criteria andAccNoFcIsNotNull() {
            addCriterion("ACC_NO_FC is not null");
            return (Criteria) this;
        }

        public Criteria andAccNoFcEqualTo(String value) {
            addCriterion("ACC_NO_FC =", value, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcNotEqualTo(String value) {
            addCriterion("ACC_NO_FC <>", value, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcGreaterThan(String value) {
            addCriterion("ACC_NO_FC >", value, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_NO_FC >=", value, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcLessThan(String value) {
            addCriterion("ACC_NO_FC <", value, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcLessThanOrEqualTo(String value) {
            addCriterion("ACC_NO_FC <=", value, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcLike(String value) {
            addCriterion("ACC_NO_FC like", value, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcNotLike(String value) {
            addCriterion("ACC_NO_FC not like", value, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcIn(List<String> values) {
            addCriterion("ACC_NO_FC in", values, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcNotIn(List<String> values) {
            addCriterion("ACC_NO_FC not in", values, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcBetween(String value1, String value2) {
            addCriterion("ACC_NO_FC between", value1, value2, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andAccNoFcNotBetween(String value1, String value2) {
            addCriterion("ACC_NO_FC not between", value1, value2, "accNoFc");
            return (Criteria) this;
        }

        public Criteria andWhPjsqIsNull() {
            addCriterion("WH_PJSQ is null");
            return (Criteria) this;
        }

        public Criteria andWhPjsqIsNotNull() {
            addCriterion("WH_PJSQ is not null");
            return (Criteria) this;
        }

        public Criteria andWhPjsqEqualTo(String value) {
            addCriterion("WH_PJSQ =", value, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqNotEqualTo(String value) {
            addCriterion("WH_PJSQ <>", value, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqGreaterThan(String value) {
            addCriterion("WH_PJSQ >", value, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqGreaterThanOrEqualTo(String value) {
            addCriterion("WH_PJSQ >=", value, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqLessThan(String value) {
            addCriterion("WH_PJSQ <", value, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqLessThanOrEqualTo(String value) {
            addCriterion("WH_PJSQ <=", value, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqLike(String value) {
            addCriterion("WH_PJSQ like", value, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqNotLike(String value) {
            addCriterion("WH_PJSQ not like", value, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqIn(List<String> values) {
            addCriterion("WH_PJSQ in", values, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqNotIn(List<String> values) {
            addCriterion("WH_PJSQ not in", values, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqBetween(String value1, String value2) {
            addCriterion("WH_PJSQ between", value1, value2, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andWhPjsqNotBetween(String value1, String value2) {
            addCriterion("WH_PJSQ not between", value1, value2, "whPjsq");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdIsNull() {
            addCriterion("QTY_AD_ID is null");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdIsNotNull() {
            addCriterion("QTY_AD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdEqualTo(String value) {
            addCriterion("QTY_AD_ID =", value, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdNotEqualTo(String value) {
            addCriterion("QTY_AD_ID <>", value, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdGreaterThan(String value) {
            addCriterion("QTY_AD_ID >", value, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdGreaterThanOrEqualTo(String value) {
            addCriterion("QTY_AD_ID >=", value, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdLessThan(String value) {
            addCriterion("QTY_AD_ID <", value, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdLessThanOrEqualTo(String value) {
            addCriterion("QTY_AD_ID <=", value, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdLike(String value) {
            addCriterion("QTY_AD_ID like", value, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdNotLike(String value) {
            addCriterion("QTY_AD_ID not like", value, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdIn(List<String> values) {
            addCriterion("QTY_AD_ID in", values, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdNotIn(List<String> values) {
            addCriterion("QTY_AD_ID not in", values, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdBetween(String value1, String value2) {
            addCriterion("QTY_AD_ID between", value1, value2, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andQtyAdIdNotBetween(String value1, String value2) {
            addCriterion("QTY_AD_ID not between", value1, value2, "qtyAdId");
            return (Criteria) this;
        }

        public Criteria andTbNumidsIsNull() {
            addCriterion("TB_NUMIDS is null");
            return (Criteria) this;
        }

        public Criteria andTbNumidsIsNotNull() {
            addCriterion("TB_NUMIDS is not null");
            return (Criteria) this;
        }

        public Criteria andTbNumidsEqualTo(String value) {
            addCriterion("TB_NUMIDS =", value, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsNotEqualTo(String value) {
            addCriterion("TB_NUMIDS <>", value, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsGreaterThan(String value) {
            addCriterion("TB_NUMIDS >", value, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsGreaterThanOrEqualTo(String value) {
            addCriterion("TB_NUMIDS >=", value, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsLessThan(String value) {
            addCriterion("TB_NUMIDS <", value, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsLessThanOrEqualTo(String value) {
            addCriterion("TB_NUMIDS <=", value, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsLike(String value) {
            addCriterion("TB_NUMIDS like", value, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsNotLike(String value) {
            addCriterion("TB_NUMIDS not like", value, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsIn(List<String> values) {
            addCriterion("TB_NUMIDS in", values, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsNotIn(List<String> values) {
            addCriterion("TB_NUMIDS not in", values, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsBetween(String value1, String value2) {
            addCriterion("TB_NUMIDS between", value1, value2, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andTbNumidsNotBetween(String value1, String value2) {
            addCriterion("TB_NUMIDS not between", value1, value2, "tbNumids");
            return (Criteria) this;
        }

        public Criteria andChkTbwhIsNull() {
            addCriterion("CHK_TBWH is null");
            return (Criteria) this;
        }

        public Criteria andChkTbwhIsNotNull() {
            addCriterion("CHK_TBWH is not null");
            return (Criteria) this;
        }

        public Criteria andChkTbwhEqualTo(String value) {
            addCriterion("CHK_TBWH =", value, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhNotEqualTo(String value) {
            addCriterion("CHK_TBWH <>", value, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhGreaterThan(String value) {
            addCriterion("CHK_TBWH >", value, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_TBWH >=", value, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhLessThan(String value) {
            addCriterion("CHK_TBWH <", value, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhLessThanOrEqualTo(String value) {
            addCriterion("CHK_TBWH <=", value, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhLike(String value) {
            addCriterion("CHK_TBWH like", value, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhNotLike(String value) {
            addCriterion("CHK_TBWH not like", value, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhIn(List<String> values) {
            addCriterion("CHK_TBWH in", values, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhNotIn(List<String> values) {
            addCriterion("CHK_TBWH not in", values, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhBetween(String value1, String value2) {
            addCriterion("CHK_TBWH between", value1, value2, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andChkTbwhNotBetween(String value1, String value2) {
            addCriterion("CHK_TBWH not between", value1, value2, "chkTbwh");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdIsNull() {
            addCriterion("QTY_ML_ID is null");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdIsNotNull() {
            addCriterion("QTY_ML_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdEqualTo(String value) {
            addCriterion("QTY_ML_ID =", value, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdNotEqualTo(String value) {
            addCriterion("QTY_ML_ID <>", value, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdGreaterThan(String value) {
            addCriterion("QTY_ML_ID >", value, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdGreaterThanOrEqualTo(String value) {
            addCriterion("QTY_ML_ID >=", value, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdLessThan(String value) {
            addCriterion("QTY_ML_ID <", value, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdLessThanOrEqualTo(String value) {
            addCriterion("QTY_ML_ID <=", value, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdLike(String value) {
            addCriterion("QTY_ML_ID like", value, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdNotLike(String value) {
            addCriterion("QTY_ML_ID not like", value, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdIn(List<String> values) {
            addCriterion("QTY_ML_ID in", values, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdNotIn(List<String> values) {
            addCriterion("QTY_ML_ID not in", values, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdBetween(String value1, String value2) {
            addCriterion("QTY_ML_ID between", value1, value2, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andQtyMlIdNotBetween(String value1, String value2) {
            addCriterion("QTY_ML_ID not between", value1, value2, "qtyMlId");
            return (Criteria) this;
        }

        public Criteria andChkBarIsNull() {
            addCriterion("CHK_BAR is null");
            return (Criteria) this;
        }

        public Criteria andChkBarIsNotNull() {
            addCriterion("CHK_BAR is not null");
            return (Criteria) this;
        }

        public Criteria andChkBarEqualTo(String value) {
            addCriterion("CHK_BAR =", value, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarNotEqualTo(String value) {
            addCriterion("CHK_BAR <>", value, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarGreaterThan(String value) {
            addCriterion("CHK_BAR >", value, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_BAR >=", value, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarLessThan(String value) {
            addCriterion("CHK_BAR <", value, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarLessThanOrEqualTo(String value) {
            addCriterion("CHK_BAR <=", value, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarLike(String value) {
            addCriterion("CHK_BAR like", value, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarNotLike(String value) {
            addCriterion("CHK_BAR not like", value, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarIn(List<String> values) {
            addCriterion("CHK_BAR in", values, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarNotIn(List<String> values) {
            addCriterion("CHK_BAR not in", values, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarBetween(String value1, String value2) {
            addCriterion("CHK_BAR between", value1, value2, "chkBar");
            return (Criteria) this;
        }

        public Criteria andChkBarNotBetween(String value1, String value2) {
            addCriterion("CHK_BAR not between", value1, value2, "chkBar");
            return (Criteria) this;
        }

        public Criteria andBilMlIsNull() {
            addCriterion("BIL_ML is null");
            return (Criteria) this;
        }

        public Criteria andBilMlIsNotNull() {
            addCriterion("BIL_ML is not null");
            return (Criteria) this;
        }

        public Criteria andBilMlEqualTo(String value) {
            addCriterion("BIL_ML =", value, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlNotEqualTo(String value) {
            addCriterion("BIL_ML <>", value, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlGreaterThan(String value) {
            addCriterion("BIL_ML >", value, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_ML >=", value, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlLessThan(String value) {
            addCriterion("BIL_ML <", value, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlLessThanOrEqualTo(String value) {
            addCriterion("BIL_ML <=", value, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlLike(String value) {
            addCriterion("BIL_ML like", value, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlNotLike(String value) {
            addCriterion("BIL_ML not like", value, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlIn(List<String> values) {
            addCriterion("BIL_ML in", values, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlNotIn(List<String> values) {
            addCriterion("BIL_ML not in", values, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlBetween(String value1, String value2) {
            addCriterion("BIL_ML between", value1, value2, "bilMl");
            return (Criteria) this;
        }

        public Criteria andBilMlNotBetween(String value1, String value2) {
            addCriterion("BIL_ML not between", value1, value2, "bilMl");
            return (Criteria) this;
        }

        public Criteria andChkWgIsNull() {
            addCriterion("CHK_WG is null");
            return (Criteria) this;
        }

        public Criteria andChkWgIsNotNull() {
            addCriterion("CHK_WG is not null");
            return (Criteria) this;
        }

        public Criteria andChkWgEqualTo(String value) {
            addCriterion("CHK_WG =", value, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgNotEqualTo(String value) {
            addCriterion("CHK_WG <>", value, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgGreaterThan(String value) {
            addCriterion("CHK_WG >", value, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_WG >=", value, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgLessThan(String value) {
            addCriterion("CHK_WG <", value, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgLessThanOrEqualTo(String value) {
            addCriterion("CHK_WG <=", value, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgLike(String value) {
            addCriterion("CHK_WG like", value, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgNotLike(String value) {
            addCriterion("CHK_WG not like", value, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgIn(List<String> values) {
            addCriterion("CHK_WG in", values, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgNotIn(List<String> values) {
            addCriterion("CHK_WG not in", values, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgBetween(String value1, String value2) {
            addCriterion("CHK_WG between", value1, value2, "chkWg");
            return (Criteria) this;
        }

        public Criteria andChkWgNotBetween(String value1, String value2) {
            addCriterion("CHK_WG not between", value1, value2, "chkWg");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNull() {
            addCriterion("CPY_SW is null");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNotNull() {
            addCriterion("CPY_SW is not null");
            return (Criteria) this;
        }

        public Criteria andCpySwEqualTo(String value) {
            addCriterion("CPY_SW =", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotEqualTo(String value) {
            addCriterion("CPY_SW <>", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThan(String value) {
            addCriterion("CPY_SW >", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThanOrEqualTo(String value) {
            addCriterion("CPY_SW >=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThan(String value) {
            addCriterion("CPY_SW <", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThanOrEqualTo(String value) {
            addCriterion("CPY_SW <=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLike(String value) {
            addCriterion("CPY_SW like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotLike(String value) {
            addCriterion("CPY_SW not like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwIn(List<String> values) {
            addCriterion("CPY_SW in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotIn(List<String> values) {
            addCriterion("CPY_SW not in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwBetween(String value1, String value2) {
            addCriterion("CPY_SW between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotBetween(String value1, String value2) {
            addCriterion("CPY_SW not between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andMadeNoIsNull() {
            addCriterion("MADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMadeNoIsNotNull() {
            addCriterion("MADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMadeNoEqualTo(String value) {
            addCriterion("MADE_NO =", value, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoNotEqualTo(String value) {
            addCriterion("MADE_NO <>", value, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoGreaterThan(String value) {
            addCriterion("MADE_NO >", value, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoGreaterThanOrEqualTo(String value) {
            addCriterion("MADE_NO >=", value, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoLessThan(String value) {
            addCriterion("MADE_NO <", value, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoLessThanOrEqualTo(String value) {
            addCriterion("MADE_NO <=", value, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoLike(String value) {
            addCriterion("MADE_NO like", value, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoNotLike(String value) {
            addCriterion("MADE_NO not like", value, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoIn(List<String> values) {
            addCriterion("MADE_NO in", values, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoNotIn(List<String> values) {
            addCriterion("MADE_NO not in", values, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoBetween(String value1, String value2) {
            addCriterion("MADE_NO between", value1, value2, "madeNo");
            return (Criteria) this;
        }

        public Criteria andMadeNoNotBetween(String value1, String value2) {
            addCriterion("MADE_NO not between", value1, value2, "madeNo");
            return (Criteria) this;
        }

        public Criteria andStdNoIsNull() {
            addCriterion("STD_NO is null");
            return (Criteria) this;
        }

        public Criteria andStdNoIsNotNull() {
            addCriterion("STD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStdNoEqualTo(String value) {
            addCriterion("STD_NO =", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoNotEqualTo(String value) {
            addCriterion("STD_NO <>", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoGreaterThan(String value) {
            addCriterion("STD_NO >", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoGreaterThanOrEqualTo(String value) {
            addCriterion("STD_NO >=", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoLessThan(String value) {
            addCriterion("STD_NO <", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoLessThanOrEqualTo(String value) {
            addCriterion("STD_NO <=", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoLike(String value) {
            addCriterion("STD_NO like", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoNotLike(String value) {
            addCriterion("STD_NO not like", value, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoIn(List<String> values) {
            addCriterion("STD_NO in", values, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoNotIn(List<String> values) {
            addCriterion("STD_NO not in", values, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoBetween(String value1, String value2) {
            addCriterion("STD_NO between", value1, value2, "stdNo");
            return (Criteria) this;
        }

        public Criteria andStdNoNotBetween(String value1, String value2) {
            addCriterion("STD_NO not between", value1, value2, "stdNo");
            return (Criteria) this;
        }

        public Criteria andExpUpIsNull() {
            addCriterion("EXP_UP is null");
            return (Criteria) this;
        }

        public Criteria andExpUpIsNotNull() {
            addCriterion("EXP_UP is not null");
            return (Criteria) this;
        }

        public Criteria andExpUpEqualTo(String value) {
            addCriterion("EXP_UP =", value, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpNotEqualTo(String value) {
            addCriterion("EXP_UP <>", value, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpGreaterThan(String value) {
            addCriterion("EXP_UP >", value, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpGreaterThanOrEqualTo(String value) {
            addCriterion("EXP_UP >=", value, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpLessThan(String value) {
            addCriterion("EXP_UP <", value, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpLessThanOrEqualTo(String value) {
            addCriterion("EXP_UP <=", value, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpLike(String value) {
            addCriterion("EXP_UP like", value, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpNotLike(String value) {
            addCriterion("EXP_UP not like", value, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpIn(List<String> values) {
            addCriterion("EXP_UP in", values, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpNotIn(List<String> values) {
            addCriterion("EXP_UP not in", values, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpBetween(String value1, String value2) {
            addCriterion("EXP_UP between", value1, value2, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpUpNotBetween(String value1, String value2) {
            addCriterion("EXP_UP not between", value1, value2, "expUp");
            return (Criteria) this;
        }

        public Criteria andExpSpIsNull() {
            addCriterion("EXP_SP is null");
            return (Criteria) this;
        }

        public Criteria andExpSpIsNotNull() {
            addCriterion("EXP_SP is not null");
            return (Criteria) this;
        }

        public Criteria andExpSpEqualTo(String value) {
            addCriterion("EXP_SP =", value, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpNotEqualTo(String value) {
            addCriterion("EXP_SP <>", value, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpGreaterThan(String value) {
            addCriterion("EXP_SP >", value, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpGreaterThanOrEqualTo(String value) {
            addCriterion("EXP_SP >=", value, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpLessThan(String value) {
            addCriterion("EXP_SP <", value, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpLessThanOrEqualTo(String value) {
            addCriterion("EXP_SP <=", value, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpLike(String value) {
            addCriterion("EXP_SP like", value, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpNotLike(String value) {
            addCriterion("EXP_SP not like", value, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpIn(List<String> values) {
            addCriterion("EXP_SP in", values, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpNotIn(List<String> values) {
            addCriterion("EXP_SP not in", values, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpBetween(String value1, String value2) {
            addCriterion("EXP_SP between", value1, value2, "expSp");
            return (Criteria) this;
        }

        public Criteria andExpSpNotBetween(String value1, String value2) {
            addCriterion("EXP_SP not between", value1, value2, "expSp");
            return (Criteria) this;
        }

        public Criteria andLockManIsNull() {
            addCriterion("LOCK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLockManIsNotNull() {
            addCriterion("LOCK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLockManEqualTo(String value) {
            addCriterion("LOCK_MAN =", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotEqualTo(String value) {
            addCriterion("LOCK_MAN <>", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThan(String value) {
            addCriterion("LOCK_MAN >", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN >=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThan(String value) {
            addCriterion("LOCK_MAN <", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN <=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLike(String value) {
            addCriterion("LOCK_MAN like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotLike(String value) {
            addCriterion("LOCK_MAN not like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManIn(List<String> values) {
            addCriterion("LOCK_MAN in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotIn(List<String> values) {
            addCriterion("LOCK_MAN not in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManBetween(String value1, String value2) {
            addCriterion("LOCK_MAN between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotBetween(String value1, String value2) {
            addCriterion("LOCK_MAN not between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNull() {
            addCriterion("LOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNotNull() {
            addCriterion("LOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLockDateEqualTo(Date value) {
            addCriterion("LOCK_DATE =", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotEqualTo(Date value) {
            addCriterion("LOCK_DATE <>", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThan(Date value) {
            addCriterion("LOCK_DATE >", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE >=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThan(Date value) {
            addCriterion("LOCK_DATE <", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE <=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateIn(List<Date> values) {
            addCriterion("LOCK_DATE in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotIn(List<Date> values) {
            addCriterion("LOCK_DATE not in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE not between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andJdNumidsIsNull() {
            addCriterion("JD_NUMIDS is null");
            return (Criteria) this;
        }

        public Criteria andJdNumidsIsNotNull() {
            addCriterion("JD_NUMIDS is not null");
            return (Criteria) this;
        }

        public Criteria andJdNumidsEqualTo(String value) {
            addCriterion("JD_NUMIDS =", value, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsNotEqualTo(String value) {
            addCriterion("JD_NUMIDS <>", value, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsGreaterThan(String value) {
            addCriterion("JD_NUMIDS >", value, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsGreaterThanOrEqualTo(String value) {
            addCriterion("JD_NUMIDS >=", value, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsLessThan(String value) {
            addCriterion("JD_NUMIDS <", value, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsLessThanOrEqualTo(String value) {
            addCriterion("JD_NUMIDS <=", value, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsLike(String value) {
            addCriterion("JD_NUMIDS like", value, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsNotLike(String value) {
            addCriterion("JD_NUMIDS not like", value, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsIn(List<String> values) {
            addCriterion("JD_NUMIDS in", values, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsNotIn(List<String> values) {
            addCriterion("JD_NUMIDS not in", values, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsBetween(String value1, String value2) {
            addCriterion("JD_NUMIDS between", value1, value2, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andJdNumidsNotBetween(String value1, String value2) {
            addCriterion("JD_NUMIDS not between", value1, value2, "jdNumids");
            return (Criteria) this;
        }

        public Criteria andQcUtIsNull() {
            addCriterion("QC_UT is null");
            return (Criteria) this;
        }

        public Criteria andQcUtIsNotNull() {
            addCriterion("QC_UT is not null");
            return (Criteria) this;
        }

        public Criteria andQcUtEqualTo(String value) {
            addCriterion("QC_UT =", value, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtNotEqualTo(String value) {
            addCriterion("QC_UT <>", value, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtGreaterThan(String value) {
            addCriterion("QC_UT >", value, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtGreaterThanOrEqualTo(String value) {
            addCriterion("QC_UT >=", value, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtLessThan(String value) {
            addCriterion("QC_UT <", value, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtLessThanOrEqualTo(String value) {
            addCriterion("QC_UT <=", value, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtLike(String value) {
            addCriterion("QC_UT like", value, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtNotLike(String value) {
            addCriterion("QC_UT not like", value, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtIn(List<String> values) {
            addCriterion("QC_UT in", values, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtNotIn(List<String> values) {
            addCriterion("QC_UT not in", values, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtBetween(String value1, String value2) {
            addCriterion("QC_UT between", value1, value2, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcUtNotBetween(String value1, String value2) {
            addCriterion("QC_UT not between", value1, value2, "qcUt");
            return (Criteria) this;
        }

        public Criteria andQcQtyIsNull() {
            addCriterion("QC_QTY is null");
            return (Criteria) this;
        }

        public Criteria andQcQtyIsNotNull() {
            addCriterion("QC_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQcQtyEqualTo(BigDecimal value) {
            addCriterion("QC_QTY =", value, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyNotEqualTo(BigDecimal value) {
            addCriterion("QC_QTY <>", value, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyGreaterThan(BigDecimal value) {
            addCriterion("QC_QTY >", value, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QC_QTY >=", value, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyLessThan(BigDecimal value) {
            addCriterion("QC_QTY <", value, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QC_QTY <=", value, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyIn(List<BigDecimal> values) {
            addCriterion("QC_QTY in", values, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyNotIn(List<BigDecimal> values) {
            addCriterion("QC_QTY not in", values, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QC_QTY between", value1, value2, "qcQty");
            return (Criteria) this;
        }

        public Criteria andQcQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QC_QTY not between", value1, value2, "qcQty");
            return (Criteria) this;
        }

        public Criteria andChkFreeIsNull() {
            addCriterion("CHK_FREE is null");
            return (Criteria) this;
        }

        public Criteria andChkFreeIsNotNull() {
            addCriterion("CHK_FREE is not null");
            return (Criteria) this;
        }

        public Criteria andChkFreeEqualTo(String value) {
            addCriterion("CHK_FREE =", value, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeNotEqualTo(String value) {
            addCriterion("CHK_FREE <>", value, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeGreaterThan(String value) {
            addCriterion("CHK_FREE >", value, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_FREE >=", value, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeLessThan(String value) {
            addCriterion("CHK_FREE <", value, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeLessThanOrEqualTo(String value) {
            addCriterion("CHK_FREE <=", value, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeLike(String value) {
            addCriterion("CHK_FREE like", value, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeNotLike(String value) {
            addCriterion("CHK_FREE not like", value, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeIn(List<String> values) {
            addCriterion("CHK_FREE in", values, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeNotIn(List<String> values) {
            addCriterion("CHK_FREE not in", values, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeBetween(String value1, String value2) {
            addCriterion("CHK_FREE between", value1, value2, "chkFree");
            return (Criteria) this;
        }

        public Criteria andChkFreeNotBetween(String value1, String value2) {
            addCriterion("CHK_FREE not between", value1, value2, "chkFree");
            return (Criteria) this;
        }

        public Criteria andIdx3IsNull() {
            addCriterion("IDX3 is null");
            return (Criteria) this;
        }

        public Criteria andIdx3IsNotNull() {
            addCriterion("IDX3 is not null");
            return (Criteria) this;
        }

        public Criteria andIdx3EqualTo(String value) {
            addCriterion("IDX3 =", value, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3NotEqualTo(String value) {
            addCriterion("IDX3 <>", value, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3GreaterThan(String value) {
            addCriterion("IDX3 >", value, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3GreaterThanOrEqualTo(String value) {
            addCriterion("IDX3 >=", value, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3LessThan(String value) {
            addCriterion("IDX3 <", value, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3LessThanOrEqualTo(String value) {
            addCriterion("IDX3 <=", value, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3Like(String value) {
            addCriterion("IDX3 like", value, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3NotLike(String value) {
            addCriterion("IDX3 not like", value, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3In(List<String> values) {
            addCriterion("IDX3 in", values, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3NotIn(List<String> values) {
            addCriterion("IDX3 not in", values, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3Between(String value1, String value2) {
            addCriterion("IDX3 between", value1, value2, "idx3");
            return (Criteria) this;
        }

        public Criteria andIdx3NotBetween(String value1, String value2) {
            addCriterion("IDX3 not between", value1, value2, "idx3");
            return (Criteria) this;
        }

        public Criteria andSaleBddIsNull() {
            addCriterion("SALE_BDD is null");
            return (Criteria) this;
        }

        public Criteria andSaleBddIsNotNull() {
            addCriterion("SALE_BDD is not null");
            return (Criteria) this;
        }

        public Criteria andSaleBddEqualTo(Date value) {
            addCriterion("SALE_BDD =", value, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddNotEqualTo(Date value) {
            addCriterion("SALE_BDD <>", value, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddGreaterThan(Date value) {
            addCriterion("SALE_BDD >", value, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddGreaterThanOrEqualTo(Date value) {
            addCriterion("SALE_BDD >=", value, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddLessThan(Date value) {
            addCriterion("SALE_BDD <", value, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddLessThanOrEqualTo(Date value) {
            addCriterion("SALE_BDD <=", value, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddIn(List<Date> values) {
            addCriterion("SALE_BDD in", values, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddNotIn(List<Date> values) {
            addCriterion("SALE_BDD not in", values, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddBetween(Date value1, Date value2) {
            addCriterion("SALE_BDD between", value1, value2, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleBddNotBetween(Date value1, Date value2) {
            addCriterion("SALE_BDD not between", value1, value2, "saleBdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddIsNull() {
            addCriterion("SALE_EDD is null");
            return (Criteria) this;
        }

        public Criteria andSaleEddIsNotNull() {
            addCriterion("SALE_EDD is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEddEqualTo(Date value) {
            addCriterion("SALE_EDD =", value, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddNotEqualTo(Date value) {
            addCriterion("SALE_EDD <>", value, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddGreaterThan(Date value) {
            addCriterion("SALE_EDD >", value, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddGreaterThanOrEqualTo(Date value) {
            addCriterion("SALE_EDD >=", value, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddLessThan(Date value) {
            addCriterion("SALE_EDD <", value, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddLessThanOrEqualTo(Date value) {
            addCriterion("SALE_EDD <=", value, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddIn(List<Date> values) {
            addCriterion("SALE_EDD in", values, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddNotIn(List<Date> values) {
            addCriterion("SALE_EDD not in", values, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddBetween(Date value1, Date value2) {
            addCriterion("SALE_EDD between", value1, value2, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andSaleEddNotBetween(Date value1, Date value2) {
            addCriterion("SALE_EDD not between", value1, value2, "saleEdd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdIsNull() {
            addCriterion("REM_UP_DD is null");
            return (Criteria) this;
        }

        public Criteria andRemUpDdIsNotNull() {
            addCriterion("REM_UP_DD is not null");
            return (Criteria) this;
        }

        public Criteria andRemUpDdEqualTo(Date value) {
            addCriterion("REM_UP_DD =", value, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdNotEqualTo(Date value) {
            addCriterion("REM_UP_DD <>", value, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdGreaterThan(Date value) {
            addCriterion("REM_UP_DD >", value, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdGreaterThanOrEqualTo(Date value) {
            addCriterion("REM_UP_DD >=", value, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdLessThan(Date value) {
            addCriterion("REM_UP_DD <", value, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdLessThanOrEqualTo(Date value) {
            addCriterion("REM_UP_DD <=", value, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdIn(List<Date> values) {
            addCriterion("REM_UP_DD in", values, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdNotIn(List<Date> values) {
            addCriterion("REM_UP_DD not in", values, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdBetween(Date value1, Date value2) {
            addCriterion("REM_UP_DD between", value1, value2, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andRemUpDdNotBetween(Date value1, Date value2) {
            addCriterion("REM_UP_DD not between", value1, value2, "remUpDd");
            return (Criteria) this;
        }

        public Criteria andUprLevel6IsNull() {
            addCriterion("UPR_LEVEL6 is null");
            return (Criteria) this;
        }

        public Criteria andUprLevel6IsNotNull() {
            addCriterion("UPR_LEVEL6 is not null");
            return (Criteria) this;
        }

        public Criteria andUprLevel6EqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL6 =", value, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6NotEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL6 <>", value, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6GreaterThan(BigDecimal value) {
            addCriterion("UPR_LEVEL6 >", value, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL6 >=", value, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6LessThan(BigDecimal value) {
            addCriterion("UPR_LEVEL6 <", value, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPR_LEVEL6 <=", value, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6In(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL6 in", values, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6NotIn(List<BigDecimal> values) {
            addCriterion("UPR_LEVEL6 not in", values, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL6 between", value1, value2, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andUprLevel6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPR_LEVEL6 not between", value1, value2, "uprLevel6");
            return (Criteria) this;
        }

        public Criteria andSCodeIsNull() {
            addCriterion("S_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSCodeIsNotNull() {
            addCriterion("S_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSCodeEqualTo(String value) {
            addCriterion("S_CODE =", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotEqualTo(String value) {
            addCriterion("S_CODE <>", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeGreaterThan(String value) {
            addCriterion("S_CODE >", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeGreaterThanOrEqualTo(String value) {
            addCriterion("S_CODE >=", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLessThan(String value) {
            addCriterion("S_CODE <", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLessThanOrEqualTo(String value) {
            addCriterion("S_CODE <=", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLike(String value) {
            addCriterion("S_CODE like", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotLike(String value) {
            addCriterion("S_CODE not like", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeIn(List<String> values) {
            addCriterion("S_CODE in", values, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotIn(List<String> values) {
            addCriterion("S_CODE not in", values, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeBetween(String value1, String value2) {
            addCriterion("S_CODE between", value1, value2, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotBetween(String value1, String value2) {
            addCriterion("S_CODE not between", value1, value2, "sCode");
            return (Criteria) this;
        }

        public Criteria andValidIdIsNull() {
            addCriterion("VALID_ID is null");
            return (Criteria) this;
        }

        public Criteria andValidIdIsNotNull() {
            addCriterion("VALID_ID is not null");
            return (Criteria) this;
        }

        public Criteria andValidIdEqualTo(String value) {
            addCriterion("VALID_ID =", value, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdNotEqualTo(String value) {
            addCriterion("VALID_ID <>", value, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdGreaterThan(String value) {
            addCriterion("VALID_ID >", value, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_ID >=", value, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdLessThan(String value) {
            addCriterion("VALID_ID <", value, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdLessThanOrEqualTo(String value) {
            addCriterion("VALID_ID <=", value, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdLike(String value) {
            addCriterion("VALID_ID like", value, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdNotLike(String value) {
            addCriterion("VALID_ID not like", value, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdIn(List<String> values) {
            addCriterion("VALID_ID in", values, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdNotIn(List<String> values) {
            addCriterion("VALID_ID not in", values, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdBetween(String value1, String value2) {
            addCriterion("VALID_ID between", value1, value2, "validId");
            return (Criteria) this;
        }

        public Criteria andValidIdNotBetween(String value1, String value2) {
            addCriterion("VALID_ID not between", value1, value2, "validId");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlIsNull() {
            addCriterion("CHK_BT_CTRL is null");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlIsNotNull() {
            addCriterion("CHK_BT_CTRL is not null");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlEqualTo(String value) {
            addCriterion("CHK_BT_CTRL =", value, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlNotEqualTo(String value) {
            addCriterion("CHK_BT_CTRL <>", value, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlGreaterThan(String value) {
            addCriterion("CHK_BT_CTRL >", value, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_BT_CTRL >=", value, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlLessThan(String value) {
            addCriterion("CHK_BT_CTRL <", value, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlLessThanOrEqualTo(String value) {
            addCriterion("CHK_BT_CTRL <=", value, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlLike(String value) {
            addCriterion("CHK_BT_CTRL like", value, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlNotLike(String value) {
            addCriterion("CHK_BT_CTRL not like", value, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlIn(List<String> values) {
            addCriterion("CHK_BT_CTRL in", values, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlNotIn(List<String> values) {
            addCriterion("CHK_BT_CTRL not in", values, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlBetween(String value1, String value2) {
            addCriterion("CHK_BT_CTRL between", value1, value2, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBtCtrlNotBetween(String value1, String value2) {
            addCriterion("CHK_BT_CTRL not between", value1, value2, "chkBtCtrl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlIsNull() {
            addCriterion("CHK_BARPRD_OL is null");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlIsNotNull() {
            addCriterion("CHK_BARPRD_OL is not null");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlEqualTo(String value) {
            addCriterion("CHK_BARPRD_OL =", value, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlNotEqualTo(String value) {
            addCriterion("CHK_BARPRD_OL <>", value, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlGreaterThan(String value) {
            addCriterion("CHK_BARPRD_OL >", value, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_BARPRD_OL >=", value, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlLessThan(String value) {
            addCriterion("CHK_BARPRD_OL <", value, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlLessThanOrEqualTo(String value) {
            addCriterion("CHK_BARPRD_OL <=", value, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlLike(String value) {
            addCriterion("CHK_BARPRD_OL like", value, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlNotLike(String value) {
            addCriterion("CHK_BARPRD_OL not like", value, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlIn(List<String> values) {
            addCriterion("CHK_BARPRD_OL in", values, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlNotIn(List<String> values) {
            addCriterion("CHK_BARPRD_OL not in", values, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlBetween(String value1, String value2) {
            addCriterion("CHK_BARPRD_OL between", value1, value2, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andChkBarprdOlNotBetween(String value1, String value2) {
            addCriterion("CHK_BARPRD_OL not between", value1, value2, "chkBarprdOl");
            return (Criteria) this;
        }

        public Criteria andValidYearsIsNull() {
            addCriterion("VALID_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andValidYearsIsNotNull() {
            addCriterion("VALID_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andValidYearsEqualTo(BigDecimal value) {
            addCriterion("VALID_YEARS =", value, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsNotEqualTo(BigDecimal value) {
            addCriterion("VALID_YEARS <>", value, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsGreaterThan(BigDecimal value) {
            addCriterion("VALID_YEARS >", value, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_YEARS >=", value, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsLessThan(BigDecimal value) {
            addCriterion("VALID_YEARS <", value, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALID_YEARS <=", value, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsIn(List<BigDecimal> values) {
            addCriterion("VALID_YEARS in", values, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsNotIn(List<BigDecimal> values) {
            addCriterion("VALID_YEARS not in", values, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_YEARS between", value1, value2, "validYears");
            return (Criteria) this;
        }

        public Criteria andValidYearsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALID_YEARS not between", value1, value2, "validYears");
            return (Criteria) this;
        }

        public Criteria andGlsTypeIsNull() {
            addCriterion("GLS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGlsTypeIsNotNull() {
            addCriterion("GLS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGlsTypeEqualTo(String value) {
            addCriterion("GLS_TYPE =", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeNotEqualTo(String value) {
            addCriterion("GLS_TYPE <>", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeGreaterThan(String value) {
            addCriterion("GLS_TYPE >", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GLS_TYPE >=", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeLessThan(String value) {
            addCriterion("GLS_TYPE <", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeLessThanOrEqualTo(String value) {
            addCriterion("GLS_TYPE <=", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeLike(String value) {
            addCriterion("GLS_TYPE like", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeNotLike(String value) {
            addCriterion("GLS_TYPE not like", value, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeIn(List<String> values) {
            addCriterion("GLS_TYPE in", values, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeNotIn(List<String> values) {
            addCriterion("GLS_TYPE not in", values, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeBetween(String value1, String value2) {
            addCriterion("GLS_TYPE between", value1, value2, "glsType");
            return (Criteria) this;
        }

        public Criteria andGlsTypeNotBetween(String value1, String value2) {
            addCriterion("GLS_TYPE not between", value1, value2, "glsType");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceIsNull() {
            addCriterion("MP_QTYCHOICE is null");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceIsNotNull() {
            addCriterion("MP_QTYCHOICE is not null");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceEqualTo(String value) {
            addCriterion("MP_QTYCHOICE =", value, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceNotEqualTo(String value) {
            addCriterion("MP_QTYCHOICE <>", value, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceGreaterThan(String value) {
            addCriterion("MP_QTYCHOICE >", value, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceGreaterThanOrEqualTo(String value) {
            addCriterion("MP_QTYCHOICE >=", value, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceLessThan(String value) {
            addCriterion("MP_QTYCHOICE <", value, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceLessThanOrEqualTo(String value) {
            addCriterion("MP_QTYCHOICE <=", value, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceLike(String value) {
            addCriterion("MP_QTYCHOICE like", value, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceNotLike(String value) {
            addCriterion("MP_QTYCHOICE not like", value, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceIn(List<String> values) {
            addCriterion("MP_QTYCHOICE in", values, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceNotIn(List<String> values) {
            addCriterion("MP_QTYCHOICE not in", values, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceBetween(String value1, String value2) {
            addCriterion("MP_QTYCHOICE between", value1, value2, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andMpQtychoiceNotBetween(String value1, String value2) {
            addCriterion("MP_QTYCHOICE not between", value1, value2, "mpQtychoice");
            return (Criteria) this;
        }

        public Criteria andTransmIsNull() {
            addCriterion("TRANSM is null");
            return (Criteria) this;
        }

        public Criteria andTransmIsNotNull() {
            addCriterion("TRANSM is not null");
            return (Criteria) this;
        }

        public Criteria andTransmEqualTo(String value) {
            addCriterion("TRANSM =", value, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmNotEqualTo(String value) {
            addCriterion("TRANSM <>", value, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmGreaterThan(String value) {
            addCriterion("TRANSM >", value, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSM >=", value, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmLessThan(String value) {
            addCriterion("TRANSM <", value, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmLessThanOrEqualTo(String value) {
            addCriterion("TRANSM <=", value, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmLike(String value) {
            addCriterion("TRANSM like", value, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmNotLike(String value) {
            addCriterion("TRANSM not like", value, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmIn(List<String> values) {
            addCriterion("TRANSM in", values, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmNotIn(List<String> values) {
            addCriterion("TRANSM not in", values, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmBetween(String value1, String value2) {
            addCriterion("TRANSM between", value1, value2, "transm");
            return (Criteria) this;
        }

        public Criteria andTransmNotBetween(String value1, String value2) {
            addCriterion("TRANSM not between", value1, value2, "transm");
            return (Criteria) this;
        }

        public Criteria andLogistIsNull() {
            addCriterion("LOGIST is null");
            return (Criteria) this;
        }

        public Criteria andLogistIsNotNull() {
            addCriterion("LOGIST is not null");
            return (Criteria) this;
        }

        public Criteria andLogistEqualTo(String value) {
            addCriterion("LOGIST =", value, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistNotEqualTo(String value) {
            addCriterion("LOGIST <>", value, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistGreaterThan(String value) {
            addCriterion("LOGIST >", value, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIST >=", value, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistLessThan(String value) {
            addCriterion("LOGIST <", value, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistLessThanOrEqualTo(String value) {
            addCriterion("LOGIST <=", value, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistLike(String value) {
            addCriterion("LOGIST like", value, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistNotLike(String value) {
            addCriterion("LOGIST not like", value, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistIn(List<String> values) {
            addCriterion("LOGIST in", values, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistNotIn(List<String> values) {
            addCriterion("LOGIST not in", values, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistBetween(String value1, String value2) {
            addCriterion("LOGIST between", value1, value2, "logist");
            return (Criteria) this;
        }

        public Criteria andLogistNotBetween(String value1, String value2) {
            addCriterion("LOGIST not between", value1, value2, "logist");
            return (Criteria) this;
        }

        public Criteria andTaxcodeIsNull() {
            addCriterion("TAXCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxcodeIsNotNull() {
            addCriterion("TAXCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxcodeEqualTo(String value) {
            addCriterion("TAXCODE =", value, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeNotEqualTo(String value) {
            addCriterion("TAXCODE <>", value, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeGreaterThan(String value) {
            addCriterion("TAXCODE >", value, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXCODE >=", value, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeLessThan(String value) {
            addCriterion("TAXCODE <", value, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeLessThanOrEqualTo(String value) {
            addCriterion("TAXCODE <=", value, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeLike(String value) {
            addCriterion("TAXCODE like", value, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeNotLike(String value) {
            addCriterion("TAXCODE not like", value, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeIn(List<String> values) {
            addCriterion("TAXCODE in", values, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeNotIn(List<String> values) {
            addCriterion("TAXCODE not in", values, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeBetween(String value1, String value2) {
            addCriterion("TAXCODE between", value1, value2, "taxcode");
            return (Criteria) this;
        }

        public Criteria andTaxcodeNotBetween(String value1, String value2) {
            addCriterion("TAXCODE not between", value1, value2, "taxcode");
            return (Criteria) this;
        }

        public Criteria andDiameterIsNull() {
            addCriterion("DIAMETER is null");
            return (Criteria) this;
        }

        public Criteria andDiameterIsNotNull() {
            addCriterion("DIAMETER is not null");
            return (Criteria) this;
        }

        public Criteria andDiameterEqualTo(String value) {
            addCriterion("DIAMETER =", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotEqualTo(String value) {
            addCriterion("DIAMETER <>", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterGreaterThan(String value) {
            addCriterion("DIAMETER >", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterGreaterThanOrEqualTo(String value) {
            addCriterion("DIAMETER >=", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLessThan(String value) {
            addCriterion("DIAMETER <", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLessThanOrEqualTo(String value) {
            addCriterion("DIAMETER <=", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLike(String value) {
            addCriterion("DIAMETER like", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotLike(String value) {
            addCriterion("DIAMETER not like", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterIn(List<String> values) {
            addCriterion("DIAMETER in", values, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotIn(List<String> values) {
            addCriterion("DIAMETER not in", values, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterBetween(String value1, String value2) {
            addCriterion("DIAMETER between", value1, value2, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotBetween(String value1, String value2) {
            addCriterion("DIAMETER not between", value1, value2, "diameter");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("RADIUS is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("RADIUS is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(String value) {
            addCriterion("RADIUS =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(String value) {
            addCriterion("RADIUS <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(String value) {
            addCriterion("RADIUS >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(String value) {
            addCriterion("RADIUS >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(String value) {
            addCriterion("RADIUS <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(String value) {
            addCriterion("RADIUS <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLike(String value) {
            addCriterion("RADIUS like", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotLike(String value) {
            addCriterion("RADIUS not like", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<String> values) {
            addCriterion("RADIUS in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<String> values) {
            addCriterion("RADIUS not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(String value1, String value2) {
            addCriterion("RADIUS between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(String value1, String value2) {
            addCriterion("RADIUS not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysIsNull() {
            addCriterion("PRE_PSDAYS is null");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysIsNotNull() {
            addCriterion("PRE_PSDAYS is not null");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysEqualTo(Integer value) {
            addCriterion("PRE_PSDAYS =", value, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysNotEqualTo(Integer value) {
            addCriterion("PRE_PSDAYS <>", value, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysGreaterThan(Integer value) {
            addCriterion("PRE_PSDAYS >", value, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRE_PSDAYS >=", value, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysLessThan(Integer value) {
            addCriterion("PRE_PSDAYS <", value, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysLessThanOrEqualTo(Integer value) {
            addCriterion("PRE_PSDAYS <=", value, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysIn(List<Integer> values) {
            addCriterion("PRE_PSDAYS in", values, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysNotIn(List<Integer> values) {
            addCriterion("PRE_PSDAYS not in", values, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysBetween(Integer value1, Integer value2) {
            addCriterion("PRE_PSDAYS between", value1, value2, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andPrePsdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("PRE_PSDAYS not between", value1, value2, "prePsdays");
            return (Criteria) this;
        }

        public Criteria andSalNoWhIsNull() {
            addCriterion("SAL_NO_WH is null");
            return (Criteria) this;
        }

        public Criteria andSalNoWhIsNotNull() {
            addCriterion("SAL_NO_WH is not null");
            return (Criteria) this;
        }

        public Criteria andSalNoWhEqualTo(String value) {
            addCriterion("SAL_NO_WH =", value, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhNotEqualTo(String value) {
            addCriterion("SAL_NO_WH <>", value, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhGreaterThan(String value) {
            addCriterion("SAL_NO_WH >", value, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_NO_WH >=", value, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhLessThan(String value) {
            addCriterion("SAL_NO_WH <", value, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhLessThanOrEqualTo(String value) {
            addCriterion("SAL_NO_WH <=", value, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhLike(String value) {
            addCriterion("SAL_NO_WH like", value, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhNotLike(String value) {
            addCriterion("SAL_NO_WH not like", value, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhIn(List<String> values) {
            addCriterion("SAL_NO_WH in", values, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhNotIn(List<String> values) {
            addCriterion("SAL_NO_WH not in", values, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhBetween(String value1, String value2) {
            addCriterion("SAL_NO_WH between", value1, value2, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andSalNoWhNotBetween(String value1, String value2) {
            addCriterion("SAL_NO_WH not between", value1, value2, "salNoWh");
            return (Criteria) this;
        }

        public Criteria andIsupdUpIsNull() {
            addCriterion("ISUPD_UP is null");
            return (Criteria) this;
        }

        public Criteria andIsupdUpIsNotNull() {
            addCriterion("ISUPD_UP is not null");
            return (Criteria) this;
        }

        public Criteria andIsupdUpEqualTo(String value) {
            addCriterion("ISUPD_UP =", value, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpNotEqualTo(String value) {
            addCriterion("ISUPD_UP <>", value, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpGreaterThan(String value) {
            addCriterion("ISUPD_UP >", value, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpGreaterThanOrEqualTo(String value) {
            addCriterion("ISUPD_UP >=", value, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpLessThan(String value) {
            addCriterion("ISUPD_UP <", value, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpLessThanOrEqualTo(String value) {
            addCriterion("ISUPD_UP <=", value, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpLike(String value) {
            addCriterion("ISUPD_UP like", value, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpNotLike(String value) {
            addCriterion("ISUPD_UP not like", value, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpIn(List<String> values) {
            addCriterion("ISUPD_UP in", values, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpNotIn(List<String> values) {
            addCriterion("ISUPD_UP not in", values, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpBetween(String value1, String value2) {
            addCriterion("ISUPD_UP between", value1, value2, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsupdUpNotBetween(String value1, String value2) {
            addCriterion("ISUPD_UP not between", value1, value2, "isupdUp");
            return (Criteria) this;
        }

        public Criteria andIsczIsNull() {
            addCriterion("ISCZ is null");
            return (Criteria) this;
        }

        public Criteria andIsczIsNotNull() {
            addCriterion("ISCZ is not null");
            return (Criteria) this;
        }

        public Criteria andIsczEqualTo(String value) {
            addCriterion("ISCZ =", value, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczNotEqualTo(String value) {
            addCriterion("ISCZ <>", value, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczGreaterThan(String value) {
            addCriterion("ISCZ >", value, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczGreaterThanOrEqualTo(String value) {
            addCriterion("ISCZ >=", value, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczLessThan(String value) {
            addCriterion("ISCZ <", value, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczLessThanOrEqualTo(String value) {
            addCriterion("ISCZ <=", value, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczLike(String value) {
            addCriterion("ISCZ like", value, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczNotLike(String value) {
            addCriterion("ISCZ not like", value, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczIn(List<String> values) {
            addCriterion("ISCZ in", values, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczNotIn(List<String> values) {
            addCriterion("ISCZ not in", values, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczBetween(String value1, String value2) {
            addCriterion("ISCZ between", value1, value2, "iscz");
            return (Criteria) this;
        }

        public Criteria andIsczNotBetween(String value1, String value2) {
            addCriterion("ISCZ not between", value1, value2, "iscz");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeIsNull() {
            addCriterion("CHK_SCAN_FAKE is null");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeIsNotNull() {
            addCriterion("CHK_SCAN_FAKE is not null");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeEqualTo(String value) {
            addCriterion("CHK_SCAN_FAKE =", value, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeNotEqualTo(String value) {
            addCriterion("CHK_SCAN_FAKE <>", value, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeGreaterThan(String value) {
            addCriterion("CHK_SCAN_FAKE >", value, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_SCAN_FAKE >=", value, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeLessThan(String value) {
            addCriterion("CHK_SCAN_FAKE <", value, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeLessThanOrEqualTo(String value) {
            addCriterion("CHK_SCAN_FAKE <=", value, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeLike(String value) {
            addCriterion("CHK_SCAN_FAKE like", value, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeNotLike(String value) {
            addCriterion("CHK_SCAN_FAKE not like", value, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeIn(List<String> values) {
            addCriterion("CHK_SCAN_FAKE in", values, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeNotIn(List<String> values) {
            addCriterion("CHK_SCAN_FAKE not in", values, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeBetween(String value1, String value2) {
            addCriterion("CHK_SCAN_FAKE between", value1, value2, "chkScanFake");
            return (Criteria) this;
        }

        public Criteria andChkScanFakeNotBetween(String value1, String value2) {
            addCriterion("CHK_SCAN_FAKE not between", value1, value2, "chkScanFake");
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