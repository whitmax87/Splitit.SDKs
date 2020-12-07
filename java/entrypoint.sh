#!/bin/bash
VERBOSE="$1"

# expects that "/tests" is mapped to tests and
# "/examples/" to java single api examples

cd "/tests"
export CLASSPATH="/src/target/*:/src/target/lib/*:/examples/:."

rm /examples/*.class
rm *.class

javac *.java

exit_code=0
if [ "$VERBOSE" = "1" ]; then
    java TestExamples >/dev/null || exit_code=1
    java FlexFieldsTest >/dev/null || exit_code=1
else
    java TestExamples >/dev/null 2>&1 || exit_code=1
    java FlexFieldsTest >/dev/null 2>&1 || exit_code=1
fi
exit $exit_code