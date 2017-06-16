package com.jvv.p2p.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemandDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DemandDtoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andExtIdIsNull() {
            addCriterion("ext_id is null");
            return (Criteria) this;
        }

        public Criteria andExtIdIsNotNull() {
            addCriterion("ext_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtIdEqualTo(Integer value) {
            addCriterion("ext_id =", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdNotEqualTo(Integer value) {
            addCriterion("ext_id <>", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdGreaterThan(Integer value) {
            addCriterion("ext_id >", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ext_id >=", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdLessThan(Integer value) {
            addCriterion("ext_id <", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ext_id <=", value, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdIn(List<Integer> values) {
            addCriterion("ext_id in", values, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdNotIn(List<Integer> values) {
            addCriterion("ext_id not in", values, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdBetween(Integer value1, Integer value2) {
            addCriterion("ext_id between", value1, value2, "extId");
            return (Criteria) this;
        }

        public Criteria andExtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ext_id not between", value1, value2, "extId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andLoanerIdIsNull() {
            addCriterion("loaner_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanerIdIsNotNull() {
            addCriterion("loaner_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanerIdEqualTo(Integer value) {
            addCriterion("loaner_id =", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdNotEqualTo(Integer value) {
            addCriterion("loaner_id <>", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdGreaterThan(Integer value) {
            addCriterion("loaner_id >", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loaner_id >=", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdLessThan(Integer value) {
            addCriterion("loaner_id <", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdLessThanOrEqualTo(Integer value) {
            addCriterion("loaner_id <=", value, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdIn(List<Integer> values) {
            addCriterion("loaner_id in", values, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdNotIn(List<Integer> values) {
            addCriterion("loaner_id not in", values, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdBetween(Integer value1, Integer value2) {
            addCriterion("loaner_id between", value1, value2, "loanerId");
            return (Criteria) this;
        }

        public Criteria andLoanerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loaner_id not between", value1, value2, "loanerId");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleIsNull() {
            addCriterion("self_defined_title is null");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleIsNotNull() {
            addCriterion("self_defined_title is not null");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleEqualTo(String value) {
            addCriterion("self_defined_title =", value, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleNotEqualTo(String value) {
            addCriterion("self_defined_title <>", value, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleGreaterThan(String value) {
            addCriterion("self_defined_title >", value, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleGreaterThanOrEqualTo(String value) {
            addCriterion("self_defined_title >=", value, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleLessThan(String value) {
            addCriterion("self_defined_title <", value, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleLessThanOrEqualTo(String value) {
            addCriterion("self_defined_title <=", value, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleLike(String value) {
            addCriterion("self_defined_title like", value, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleNotLike(String value) {
            addCriterion("self_defined_title not like", value, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleIn(List<String> values) {
            addCriterion("self_defined_title in", values, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleNotIn(List<String> values) {
            addCriterion("self_defined_title not in", values, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleBetween(String value1, String value2) {
            addCriterion("self_defined_title between", value1, value2, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andSelfDefinedTitleNotBetween(String value1, String value2) {
            addCriterion("self_defined_title not between", value1, value2, "selfDefinedTitle");
            return (Criteria) this;
        }

        public Criteria andLoanNameIsNull() {
            addCriterion("loan_name is null");
            return (Criteria) this;
        }

        public Criteria andLoanNameIsNotNull() {
            addCriterion("loan_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoanNameEqualTo(String value) {
            addCriterion("loan_name =", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotEqualTo(String value) {
            addCriterion("loan_name <>", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameGreaterThan(String value) {
            addCriterion("loan_name >", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameGreaterThanOrEqualTo(String value) {
            addCriterion("loan_name >=", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLessThan(String value) {
            addCriterion("loan_name <", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLessThanOrEqualTo(String value) {
            addCriterion("loan_name <=", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLike(String value) {
            addCriterion("loan_name like", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotLike(String value) {
            addCriterion("loan_name not like", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameIn(List<String> values) {
            addCriterion("loan_name in", values, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotIn(List<String> values) {
            addCriterion("loan_name not in", values, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameBetween(String value1, String value2) {
            addCriterion("loan_name between", value1, value2, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotBetween(String value1, String value2) {
            addCriterion("loan_name not between", value1, value2, "loanName");
            return (Criteria) this;
        }

        public Criteria andDimensionsIsNull() {
            addCriterion("dimensions is null");
            return (Criteria) this;
        }

        public Criteria andDimensionsIsNotNull() {
            addCriterion("dimensions is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionsEqualTo(String value) {
            addCriterion("dimensions =", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotEqualTo(String value) {
            addCriterion("dimensions <>", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsGreaterThan(String value) {
            addCriterion("dimensions >", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsGreaterThanOrEqualTo(String value) {
            addCriterion("dimensions >=", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLessThan(String value) {
            addCriterion("dimensions <", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLessThanOrEqualTo(String value) {
            addCriterion("dimensions <=", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLike(String value) {
            addCriterion("dimensions like", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotLike(String value) {
            addCriterion("dimensions not like", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsIn(List<String> values) {
            addCriterion("dimensions in", values, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotIn(List<String> values) {
            addCriterion("dimensions not in", values, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsBetween(String value1, String value2) {
            addCriterion("dimensions between", value1, value2, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotBetween(String value1, String value2) {
            addCriterion("dimensions not between", value1, value2, "dimensions");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNull() {
            addCriterion("loan_rate is null");
            return (Criteria) this;
        }

        public Criteria andLoanRateIsNotNull() {
            addCriterion("loan_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanRateEqualTo(BigDecimal value) {
            addCriterion("loan_rate =", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotEqualTo(BigDecimal value) {
            addCriterion("loan_rate <>", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThan(BigDecimal value) {
            addCriterion("loan_rate >", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_rate >=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThan(BigDecimal value) {
            addCriterion("loan_rate <", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_rate <=", value, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateIn(List<BigDecimal> values) {
            addCriterion("loan_rate in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotIn(List<BigDecimal> values) {
            addCriterion("loan_rate not in", values, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_rate between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andLoanRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_rate not between", value1, value2, "loanRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNull() {
            addCriterion("interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNotNull() {
            addCriterion("interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateEqualTo(BigDecimal value) {
            addCriterion("interest_rate =", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotEqualTo(BigDecimal value) {
            addCriterion("interest_rate <>", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThan(BigDecimal value) {
            addCriterion("interest_rate >", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_rate >=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThan(BigDecimal value) {
            addCriterion("interest_rate <", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_rate <=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateIn(List<BigDecimal> values) {
            addCriterion("interest_rate in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotIn(List<BigDecimal> values) {
            addCriterion("interest_rate not in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_rate between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_rate not between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIsNull() {
            addCriterion("time_limit_unit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIsNotNull() {
            addCriterion("time_limit_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitEqualTo(String value) {
            addCriterion("time_limit_unit =", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotEqualTo(String value) {
            addCriterion("time_limit_unit <>", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitGreaterThan(String value) {
            addCriterion("time_limit_unit >", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit_unit >=", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLessThan(String value) {
            addCriterion("time_limit_unit <", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLessThanOrEqualTo(String value) {
            addCriterion("time_limit_unit <=", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitLike(String value) {
            addCriterion("time_limit_unit like", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotLike(String value) {
            addCriterion("time_limit_unit not like", value, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitIn(List<String> values) {
            addCriterion("time_limit_unit in", values, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotIn(List<String> values) {
            addCriterion("time_limit_unit not in", values, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitBetween(String value1, String value2) {
            addCriterion("time_limit_unit between", value1, value2, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitUnitNotBetween(String value1, String value2) {
            addCriterion("time_limit_unit not between", value1, value2, "timeLimitUnit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Short value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Short value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Short value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Short value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Short value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Short value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Short> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Short> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Short value1, Short value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Short value1, Short value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountIsNull() {
            addCriterion("least_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountIsNotNull() {
            addCriterion("least_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountEqualTo(BigDecimal value) {
            addCriterion("least_invest_amount =", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountNotEqualTo(BigDecimal value) {
            addCriterion("least_invest_amount <>", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountGreaterThan(BigDecimal value) {
            addCriterion("least_invest_amount >", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("least_invest_amount >=", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountLessThan(BigDecimal value) {
            addCriterion("least_invest_amount <", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("least_invest_amount <=", value, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountIn(List<BigDecimal> values) {
            addCriterion("least_invest_amount in", values, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountNotIn(List<BigDecimal> values) {
            addCriterion("least_invest_amount not in", values, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("least_invest_amount between", value1, value2, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andLeastInvestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("least_invest_amount not between", value1, value2, "leastInvestAmount");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodIsNull() {
            addCriterion("saturation_condition_method is null");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodIsNotNull() {
            addCriterion("saturation_condition_method is not null");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodEqualTo(String value) {
            addCriterion("saturation_condition_method =", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodNotEqualTo(String value) {
            addCriterion("saturation_condition_method <>", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodGreaterThan(String value) {
            addCriterion("saturation_condition_method >", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodGreaterThanOrEqualTo(String value) {
            addCriterion("saturation_condition_method >=", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodLessThan(String value) {
            addCriterion("saturation_condition_method <", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodLessThanOrEqualTo(String value) {
            addCriterion("saturation_condition_method <=", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodLike(String value) {
            addCriterion("saturation_condition_method like", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodNotLike(String value) {
            addCriterion("saturation_condition_method not like", value, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodIn(List<String> values) {
            addCriterion("saturation_condition_method in", values, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodNotIn(List<String> values) {
            addCriterion("saturation_condition_method not in", values, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodBetween(String value1, String value2) {
            addCriterion("saturation_condition_method between", value1, value2, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionMethodNotBetween(String value1, String value2) {
            addCriterion("saturation_condition_method not between", value1, value2, "saturationConditionMethod");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionIsNull() {
            addCriterion("saturation_condition is null");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionIsNotNull() {
            addCriterion("saturation_condition is not null");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionEqualTo(String value) {
            addCriterion("saturation_condition =", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionNotEqualTo(String value) {
            addCriterion("saturation_condition <>", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionGreaterThan(String value) {
            addCriterion("saturation_condition >", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionGreaterThanOrEqualTo(String value) {
            addCriterion("saturation_condition >=", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionLessThan(String value) {
            addCriterion("saturation_condition <", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionLessThanOrEqualTo(String value) {
            addCriterion("saturation_condition <=", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionLike(String value) {
            addCriterion("saturation_condition like", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionNotLike(String value) {
            addCriterion("saturation_condition not like", value, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionIn(List<String> values) {
            addCriterion("saturation_condition in", values, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionNotIn(List<String> values) {
            addCriterion("saturation_condition not in", values, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionBetween(String value1, String value2) {
            addCriterion("saturation_condition between", value1, value2, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andSaturationConditionNotBetween(String value1, String value2) {
            addCriterion("saturation_condition not between", value1, value2, "saturationCondition");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIsNull() {
            addCriterion("invest_start_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIsNotNull() {
            addCriterion("invest_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateEqualTo(Date value) {
            addCriterion("invest_start_date =", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotEqualTo(Date value) {
            addCriterion("invest_start_date <>", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateGreaterThan(Date value) {
            addCriterion("invest_start_date >", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invest_start_date >=", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateLessThan(Date value) {
            addCriterion("invest_start_date <", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateLessThanOrEqualTo(Date value) {
            addCriterion("invest_start_date <=", value, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateIn(List<Date> values) {
            addCriterion("invest_start_date in", values, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotIn(List<Date> values) {
            addCriterion("invest_start_date not in", values, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateBetween(Date value1, Date value2) {
            addCriterion("invest_start_date between", value1, value2, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestStartDateNotBetween(Date value1, Date value2) {
            addCriterion("invest_start_date not between", value1, value2, "investStartDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateIsNull() {
            addCriterion("invest_end_date is null");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateIsNotNull() {
            addCriterion("invest_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateEqualTo(Date value) {
            addCriterion("invest_end_date =", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateNotEqualTo(Date value) {
            addCriterion("invest_end_date <>", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateGreaterThan(Date value) {
            addCriterion("invest_end_date >", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invest_end_date >=", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateLessThan(Date value) {
            addCriterion("invest_end_date <", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateLessThanOrEqualTo(Date value) {
            addCriterion("invest_end_date <=", value, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateIn(List<Date> values) {
            addCriterion("invest_end_date in", values, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateNotIn(List<Date> values) {
            addCriterion("invest_end_date not in", values, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateBetween(Date value1, Date value2) {
            addCriterion("invest_end_date between", value1, value2, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andInvestEndDateNotBetween(Date value1, Date value2) {
            addCriterion("invest_end_date not between", value1, value2, "investEndDate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdIsNull() {
            addCriterion("guarantee_id is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdIsNotNull() {
            addCriterion("guarantee_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdEqualTo(Integer value) {
            addCriterion("guarantee_id =", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdNotEqualTo(Integer value) {
            addCriterion("guarantee_id <>", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdGreaterThan(Integer value) {
            addCriterion("guarantee_id >", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("guarantee_id >=", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdLessThan(Integer value) {
            addCriterion("guarantee_id <", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdLessThanOrEqualTo(Integer value) {
            addCriterion("guarantee_id <=", value, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdIn(List<Integer> values) {
            addCriterion("guarantee_id in", values, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdNotIn(List<Integer> values) {
            addCriterion("guarantee_id not in", values, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdBetween(Integer value1, Integer value2) {
            addCriterion("guarantee_id between", value1, value2, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("guarantee_id not between", value1, value2, "guaranteeId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdIsNull() {
            addCriterion("division_tmp_id is null");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdIsNotNull() {
            addCriterion("division_tmp_id is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdEqualTo(Integer value) {
            addCriterion("division_tmp_id =", value, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdNotEqualTo(Integer value) {
            addCriterion("division_tmp_id <>", value, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdGreaterThan(Integer value) {
            addCriterion("division_tmp_id >", value, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("division_tmp_id >=", value, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdLessThan(Integer value) {
            addCriterion("division_tmp_id <", value, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("division_tmp_id <=", value, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdIn(List<Integer> values) {
            addCriterion("division_tmp_id in", values, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdNotIn(List<Integer> values) {
            addCriterion("division_tmp_id not in", values, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdBetween(Integer value1, Integer value2) {
            addCriterion("division_tmp_id between", value1, value2, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andDivisionTmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("division_tmp_id not between", value1, value2, "divisionTmpId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNull() {
            addCriterion("create_userid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNotNull() {
            addCriterion("create_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridEqualTo(Integer value) {
            addCriterion("create_userid =", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotEqualTo(Integer value) {
            addCriterion("create_userid <>", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThan(Integer value) {
            addCriterion("create_userid >", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_userid >=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThan(Integer value) {
            addCriterion("create_userid <", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThanOrEqualTo(Integer value) {
            addCriterion("create_userid <=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIn(List<Integer> values) {
            addCriterion("create_userid in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotIn(List<Integer> values) {
            addCriterion("create_userid not in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridBetween(Integer value1, Integer value2) {
            addCriterion("create_userid between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("create_userid not between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("isvalid is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("isvalid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(Integer value) {
            addCriterion("isvalid =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(Integer value) {
            addCriterion("isvalid <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(Integer value) {
            addCriterion("isvalid >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("isvalid >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(Integer value) {
            addCriterion("isvalid <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(Integer value) {
            addCriterion("isvalid <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<Integer> values) {
            addCriterion("isvalid in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<Integer> values) {
            addCriterion("isvalid not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(Integer value1, Integer value2) {
            addCriterion("isvalid between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("isvalid not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayIsNull() {
            addCriterion("allow_defer_day is null");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayIsNotNull() {
            addCriterion("allow_defer_day is not null");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayEqualTo(Integer value) {
            addCriterion("allow_defer_day =", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayNotEqualTo(Integer value) {
            addCriterion("allow_defer_day <>", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayGreaterThan(Integer value) {
            addCriterion("allow_defer_day >", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("allow_defer_day >=", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayLessThan(Integer value) {
            addCriterion("allow_defer_day <", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayLessThanOrEqualTo(Integer value) {
            addCriterion("allow_defer_day <=", value, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayIn(List<Integer> values) {
            addCriterion("allow_defer_day in", values, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayNotIn(List<Integer> values) {
            addCriterion("allow_defer_day not in", values, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayBetween(Integer value1, Integer value2) {
            addCriterion("allow_defer_day between", value1, value2, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andAllowDeferDayNotBetween(Integer value1, Integer value2) {
            addCriterion("allow_defer_day not between", value1, value2, "allowDeferDay");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("biz_type like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("biz_type not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeIsNull() {
            addCriterion("pay_bill_type is null");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeIsNotNull() {
            addCriterion("pay_bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeEqualTo(Short value) {
            addCriterion("pay_bill_type =", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeNotEqualTo(Short value) {
            addCriterion("pay_bill_type <>", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeGreaterThan(Short value) {
            addCriterion("pay_bill_type >", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_bill_type >=", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeLessThan(Short value) {
            addCriterion("pay_bill_type <", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeLessThanOrEqualTo(Short value) {
            addCriterion("pay_bill_type <=", value, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeIn(List<Short> values) {
            addCriterion("pay_bill_type in", values, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeNotIn(List<Short> values) {
            addCriterion("pay_bill_type not in", values, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeBetween(Short value1, Short value2) {
            addCriterion("pay_bill_type between", value1, value2, "payBillType");
            return (Criteria) this;
        }

        public Criteria andPayBillTypeNotBetween(Short value1, Short value2) {
            addCriterion("pay_bill_type not between", value1, value2, "payBillType");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountIsNull() {
            addCriterion("max_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountIsNotNull() {
            addCriterion("max_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountEqualTo(BigDecimal value) {
            addCriterion("max_invest_amount =", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotEqualTo(BigDecimal value) {
            addCriterion("max_invest_amount <>", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountGreaterThan(BigDecimal value) {
            addCriterion("max_invest_amount >", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_invest_amount >=", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountLessThan(BigDecimal value) {
            addCriterion("max_invest_amount <", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_invest_amount <=", value, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountIn(List<BigDecimal> values) {
            addCriterion("max_invest_amount in", values, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotIn(List<BigDecimal> values) {
            addCriterion("max_invest_amount not in", values, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_invest_amount between", value1, value2, "maxInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMaxInvestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_invest_amount not between", value1, value2, "maxInvestAmount");
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