class A
{
	int a,b;
	static  int x,y,z,w;
}
/*step 1 create class A and save
step2-create class Test with java instrument package and add object of i.e new A(); to find memory area and save
step3 create manyface.mf file
-i.e =>Premain-Class: Test(this is run file name) ENTER and save in .mf
step4:-
1-javac Test.java  //compile file
2-jar cvf test.jar Test.class// to create jar file (file name test you can change) // add manifest
3-jar cmf manyface.mf test.jar Test.class //to add manyface file in jar 
4-java -javaagent:test.jar Test //find object size by javaagent
*/