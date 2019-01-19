# SecondWeekFridayTest

Week 2 Test Friday

1. Convert a given string to a linkedList of characters in the String. Do not use LinkedList class in Java but create it from scratch. Should also add and remove elements from the list.
2. Implement a Queue using Stack. Queue should have enqueue and dequeue methods
3. Create a custom arraylist using generics. The size of the array would be doubled when array limit is reached.
4. Create and Binary Search tree with Add and print(preorder) method.
Input array: {50,32,13,65,34,22,3,76,90)

// TERMINAL OUTPUT
"C:\Program Files\Java\jdk1.8.0_191\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=51403:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Admin\AppData\Local\Android\Sdk\platforms\android-28\android.jar;C:\Users\Admin\AppData\Local\Android\Sdk\platforms\android-28\data\res;C:\Users\Admin\AndroidStudioProjects\SecondWeekFridayTest\app\build\intermediates\javac\debug\compileDebugJavaWithJavac\classes;C:\Users\Admin\AndroidStudioProjects\SecondWeekFridayTest\app\build\generated\res\rs\debug;C:\Users\Admin\AndroidStudioProjects\SecondWeekFridayTest\app\build\generated\res\resValues\debug;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-fragment-28.0.0.aar\563b97c9587b0ad550f211242da1964c\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\localbroadcastmanager-28.0.0.aar\56495475b44b1b841d928cfea46f55f5\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\documentfile-28.0.0.aar\f747a8f4ce93ca676f1afd646c392121\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\animated-vector-drawable-28.0.0.aar\06927b10991069e744f7f87a73816079\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\slidingpanelayout-28.0.0.aar\bc0cbcdd3693415756347e07f751c3bb\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\viewmodel-1.1.1.aar\dd1b93156a21fb16dcdf434e77c9c789\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\appcompat-v7-28.0.0.aar\4d64b988a1f18b1eac3585bda70ef7df\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\appcompat-v7-28.0.0.aar\4d64b988a1f18b1eac3585bda70ef7df\res;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\loader-28.0.0.aar\78fc566a8732f22f194e8fe7555016d1\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\runtime-1.1.1.aar\ad8e57ee93d14fe984d913f604f8be2c\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\livedata-core-1.1.1.aar\be10ead47f0d7c6896cbff6dd291d9cc\jars\classes.jar;C:\Users\Admin\.gradle\caches\modules-2\files-2.1\com.android.support\collections\28.0.0\c1bcdade4d3cc2836130424a3f3e4182c666a745\collections-28.0.0.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\cursoradapter-28.0.0.aar\22653dbf57fe4201d8b8429759f3143f\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\runtime-1.1.1.aar\3f636748129b717f4e7edd9d0490f8c4\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-compat-28.0.0.aar\abb89d753f5e5ca1d5132145f64ab71c\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-compat-28.0.0.aar\abb89d753f5e5ca1d5132145f64ab71c\res;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-core-ui-28.0.0.aar\337a6068c4141524d6a0832f6c186ef6\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\asynclayoutinflater-28.0.0.aar\e15da0282858c1e2b3516ec0eaa6e5d1\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\print-28.0.0.aar\9f0c039779348abcbc9d1a4e1fe5f519\jars\classes.jar;C:\Users\Admin\.gradle\caches\modules-2\files-2.1\android.arch.core\common\1.1.1\e55b70d1f5620db124b3e85a7f4bdc7bd48d9f95\common-1.1.1.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\versionedparcelable-28.0.0.aar\588c38bf9d1309e520130f9c97689e07\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\viewpager-28.0.0.aar\14d3c5c6d67d5438b3374aa509d1d347\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-core-utils-28.0.0.aar\8c1aff8826930698fe0935220c9e2e6b\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-vector-drawable-28.0.0.aar\94547eb5091de9f561bbd7eb1c5b1234\jars\classes.jar;C:\Users\Admin\.gradle\caches\modules-2\files-2.1\com.android.support\support-annotations\28.0.0\ed73f5337a002d1fd24339d5fb08c2c9d9ca60d8\support-annotations-28.0.0.jar;C:\Users\Admin\.gradle\caches\modules-2\files-2.1\android.arch.lifecycle\common\1.1.1\207a6efae6a3555e326de41f76bdadd9a239cbce\common-1.1.1.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\interpolator-28.0.0.aar\2a2cf301237ced614b3b32c016f37f6e\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\livedata-1.1.1.aar\52c994008208149359e7065681294e53\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\drawerlayout-28.0.0.aar\4e81b96c19e754b793882ee673cbeddd\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\coordinatorlayout-28.0.0.aar\2fd849f637810099e26fa9fafafb6e28\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\coordinatorlayout-28.0.0.aar\2fd849f637810099e26fa9fafafb6e28\res;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\customview-28.0.0.aar\eb1a06687d2ec13a5bc5b3703a752199\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\swiperefreshlayout-28.0.0.aar\421af8a8309bd9c806122663bc8ff5a2\jars\classes.jar com.android.admin.secondweekfridaytest.MainClass
LinkedList: I   a m   t h e   g i v e n   s t r i n g 
I found and deleted
LinkedList:   a m   t h e   g i v e n   s t r i n g 
g found and deleted
LinkedList:   a m   t h e   i v e n   s t r i n g 
z not found
LinkedList:   a m   t h e   i v e n   s t r i n g 
1
2
3
[12,23,25]  [manish,akki]
Inorder traversal of the constructed tree is 
13 32 50 65 
Process finished with exit code 0