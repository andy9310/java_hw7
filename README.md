## test script
javac IntervalST.java /
java IntervalST$Node.class

##  test local test data
javac -cp .:gson.jar:algs4.jar test_IST.java /
java -cp .:gson.jar:algs4.jar  test test_IST.json
