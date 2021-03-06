/*
 * KOTLIN DIAGNOSTICS SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-100
 * MAIN LINK: expressions, constant-literals, the-types-for-integer-literals -> paragraph 1 -> sentence 1
 * NUMBER: 3
 * DESCRIPTION: Various integer literals with not allowed long literal mark in lower case.
 */

// TESTCASE NUMBER: 1
val value_1 = 0l

// TESTCASE NUMBER: 2
val value_2 = 1000000000000000l

// TESTCASE NUMBER: 3
val value_3 = 0X0l

// TESTCASE NUMBER: 4
val value_4 = 0b101l
