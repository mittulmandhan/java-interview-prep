# Array Class
* Array class is inside java.lang.reflect package.
* Array class extends java.lang.Object class.
* This class provides only public static methods to dynamically create, access and write arrays in Java.
* Array is a final class that means it cannot be extended and its methods cannot be overridden or modified.
* Array class cannot be instantiated.
* Array class also provides type safety.
* java.util.Arrays class contains variuos methods for searching and sorting whereas java.lang.reflect.Array provides static methods to dynamically create, access and write arrays.

<br>__Class Declaration:__<br>
`public final class Array extends Object`

<br>__Syntax to use Array class functions:__<br>
`Array.<function name>;`

## Creating array using Array class
1. Get the size/dimensions of the array to be created.
2. To create an array (say of X class), newInstance() method of Array class is used to pass the X class as the type of the array, and the size of the array, as parameters.
Syntax:
````
// here we have created a new one dimentional array of type x
// replace x with the data type you want int, double, char, etc.
X[] arr = (X[]) Array.newInstance(X.class, size);
````
or
````
// here we have created a new two dimentional array of type x
// replace x with the data type you want int, double, char, etc.
// similarly we can also create a three dimensional array too by passing d3
X[] arr = (X[]) Array.newInstance(X.class, d1, d2);
````
3. This method returns an Object array of the given size, which is then cast into the required X[] type.
4. Hence the required array of type X has been created.

### Methods to create an Array
* __static Object newInstance(Class<E> componentType, int length):__ This method creates a new array with the specified component type and length.
* __static Object newInstance(Class<E> componentType, int… dimensions):__ This method creates a new array with the specified component type and dimensions.

## Adding an element in an array using Array class
1. Get the value of the element to be added.
2. Get the index at which the element is to added.
3. To add an element in an array (say of X class), use the setX() method of Array class, where X is to be replaced by the type of the array such as setInt(), setDouble(), etc.
4. This method takes array object reference as the first argument, the index at which the value is to be added, and the value as the third argument.
````
Array.setX(arr, indexOfInsertion, valueToInsert);
````
5. This method inserts the element at the specified index in the given array.

### Methods to add elements
* __static void set(Object array, int index, Object value):__ This method sets the value of the indexed component of the specified array object to the specified new value.
* __static void setBoolean(Object array, int index, boolean z):__ This method sets the value of the indexed component of the specified array object to the specified boolean value.
* __static void setByte(Object array, int index, byte b):__ This method sets the value of the indexed component of the specified array object to the specified byte value.
* __static void setChar(Object array, int index, char c):__ This method sets the value of the indexed component of the specified array object to the specified char value.
* __static void setDouble(Object array, int index, double d):__ This method sets the value of the indexed component of the specified array object to the specified double value.
* __static void setFloat(Object array, int index, float f):__ This method sets the value of the indexed component of the specified array object to the specified float value.
* __static void setInt(Object array, int index, int i):__ This method sets the value of the indexed component of the specified array object to the specified int value.
* __static void setLong(Object array, int index, long l):__ This method sets the value of the indexed component of the specified array object to the specified long value.
* __static void setShort(Object array, int index, short s):__ This method sets the value of the indexed component of the specified array object to the specified short value.


## Retrieve value of an element in an array using Array class.
1. Get the index from which the value is to be retrieved.
2. To retrieve value of an element in an array (say of X class), use the getX() method of Array class, where X is to be replaced by the type of the array such as getInt(), getDouble(), etc.
3. This method takes the array object reference as the first parameter, and the index of the element as the second parameter.
<br>__Syntax:__
````
Array.getX(arr, indexOfRetrieval);
````
4. This method returns the value of an element at the specified index from the given array.

### Methods to get the value of an element
* __static Object get(Object array, int index):__ This method returns the value of the indexed component in the specified array object.
* __static boolean getBoolean(Object array, int index):__ This method returns the value of the indexed component in the specified array object, as a boolean.
* __static byte getByte(Object array, int index):__ This method returns the value of the indexed component in the specified array object, as a byte.
* __static char getChar(Object array, int index):__ This method returns the value of the indexed component in the specified array object, as a char.
* __static double getDouble(Object array, int index):__ This method returns the value of the indexed component in the specified array object, as a double.
* __static float getFloat(Object array, int index):__ This method returns the value of the indexed component in the specified array object, as a float.
* __static int getInt(Object array, int index):__ This method returns the value of the indexed component in the specified array object, as an int.
* __static int getLength(Object array):__ This method returns the length of the specified array object, as an int.
* __static long getLong(Object array, int index):__ This method returns the value of the indexed component in the specified array object, as a long.
* __static short getShort(Object array, int index):__ This method returns the value of the indexed component in the specified array object, as a short.
