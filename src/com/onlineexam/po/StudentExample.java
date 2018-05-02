package com.onlineexam.po;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNull() {
            addCriterion("sgrade is null");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNotNull() {
            addCriterion("sgrade is not null");
            return (Criteria) this;
        }

        public Criteria andSgradeEqualTo(String value) {
            addCriterion("sgrade =", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotEqualTo(String value) {
            addCriterion("sgrade <>", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThan(String value) {
            addCriterion("sgrade >", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThanOrEqualTo(String value) {
            addCriterion("sgrade >=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThan(String value) {
            addCriterion("sgrade <", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThanOrEqualTo(String value) {
            addCriterion("sgrade <=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLike(String value) {
            addCriterion("sgrade like", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotLike(String value) {
            addCriterion("sgrade not like", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeIn(List<String> values) {
            addCriterion("sgrade in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotIn(List<String> values) {
            addCriterion("sgrade not in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeBetween(String value1, String value2) {
            addCriterion("sgrade between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotBetween(String value1, String value2) {
            addCriterion("sgrade not between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSclassIsNull() {
            addCriterion("sclass is null");
            return (Criteria) this;
        }

        public Criteria andSclassIsNotNull() {
            addCriterion("sclass is not null");
            return (Criteria) this;
        }

        public Criteria andSclassEqualTo(String value) {
            addCriterion("sclass =", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotEqualTo(String value) {
            addCriterion("sclass <>", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThan(String value) {
            addCriterion("sclass >", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThanOrEqualTo(String value) {
            addCriterion("sclass >=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThan(String value) {
            addCriterion("sclass <", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThanOrEqualTo(String value) {
            addCriterion("sclass <=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLike(String value) {
            addCriterion("sclass like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotLike(String value) {
            addCriterion("sclass not like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassIn(List<String> values) {
            addCriterion("sclass in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotIn(List<String> values) {
            addCriterion("sclass not in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassBetween(String value1, String value2) {
            addCriterion("sclass between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotBetween(String value1, String value2) {
            addCriterion("sclass not between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSpwdIsNull() {
            addCriterion("spwd is null");
            return (Criteria) this;
        }

        public Criteria andSpwdIsNotNull() {
            addCriterion("spwd is not null");
            return (Criteria) this;
        }

        public Criteria andSpwdEqualTo(String value) {
            addCriterion("spwd =", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdNotEqualTo(String value) {
            addCriterion("spwd <>", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdGreaterThan(String value) {
            addCriterion("spwd >", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdGreaterThanOrEqualTo(String value) {
            addCriterion("spwd >=", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdLessThan(String value) {
            addCriterion("spwd <", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdLessThanOrEqualTo(String value) {
            addCriterion("spwd <=", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdLike(String value) {
            addCriterion("spwd like", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdNotLike(String value) {
            addCriterion("spwd not like", value, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdIn(List<String> values) {
            addCriterion("spwd in", values, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdNotIn(List<String> values) {
            addCriterion("spwd not in", values, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdBetween(String value1, String value2) {
            addCriterion("spwd between", value1, value2, "spwd");
            return (Criteria) this;
        }

        public Criteria andSpwdNotBetween(String value1, String value2) {
            addCriterion("spwd not between", value1, value2, "spwd");
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