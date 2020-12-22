#!/bin/bash
VERBOSE="$1"

# expects that "/tests" is mapped to tests and
# "/examples/" to java single api examples

cd "/tests"
export CLASSPATH="/src/target/*:/src/target/lib/*:/examples/:."

rm /examples/*.class 2> /dev/null
rm *.class 2> /dev/null

javac *.java

exit_code=0
if [ "$VERBOSE" = "1" ]; then
    java TestExamples >/dev/null || exit_code=1
    java FlexFieldsTest >/dev/null || exit_code=1
else
    java TestExamples >/dev/null 2>&1 || exit_code=1
    java FlexFieldsTest >/dev/null 2>&1 || exit_code=1
fi

rm /examples/*.class 2> /dev/null
rm *.class 2> /dev/null

exit $exit_code