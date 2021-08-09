
// 15. Here is the hierarchy of exceptions related to array index and string
// index errors:

// Exception
// +-- RuntimeException
// +-- IndexOutOfBoundsException
// +-- ArrayIndexOutOfBoundsException
// +-- StringIndexOutOfBoundsException

// Suppose you had a method X that could throw both array index and string index
// exceptions. Assuming that X does not have any try/catch statements, which of
// the following statements are correct?[Check all correct answers.]

// A.The declaration for X must include "throws ArrayIndexOutOfBoundsException,
// StringIndexOutOfBoundsException".
// B.If a method calling X catches IndexOutOfBoundsException, both array and 
// string index exceptions are caught. +
// C.If the declaration for X includes "throws IndexOutOfBoundsException", any
// calling method must use a try/catch block.
// D.The declaration for X does not have to mention exceptions.+
