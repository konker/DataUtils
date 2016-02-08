package com.luxvelocitas.tinydatautils;

/**
 * A mapping from String values to various types.
 * In effect, a glorified HashMap.
 *
 */
public class CDataBundleWrapper {

    public static native long create();
    public static native void destroy(long nativePtr);

    /**
     * Returns the number of mappings contained in this DataBundle.
     *
     * @return the number of mappings as an int.
     */
    public static native int size(long nativePtr);

    /**
     * Returns true if the mapping of this DataBundle is empty, false otherwise.
     */
    public static native boolean isEmpty(long nativePtr);

    /**
     * Removes all elements from the mapping of this DataBundle.
     */
    public static native void clear(long nativePtr);

    /**
     * Returns true if the given key is contained in the mapping
     * of this DataBundle.
     *
     * @param key a String key
     * @return true if the key is part of the mapping, false otherwise
     */
    public static native boolean containsKey(long nativePrt, String key);

    /**
     * Removes any entry with the given key from the mapping of this DataBundle.
     *
     * @param key a String key
     */
    public static native void remove(long nativePtr, String key);

    /**
     * Inserts a Boolean value into the mapping of this DataBundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key a String, or null
     * @param value a Boolean, or null
     */
    public static native void putBoolean(long nativePtr, String key, boolean value);

    /**
     * Inserts a byte value into the mapping of this DataBundle, replacing
     * any existing value for the given key.
     *
     * @param key a String, or null
     * @param value a byte
     */
    public static native void putByte(long nativePtr, String key, byte value);

    /**
     * Inserts a char value into the mapping of this DataBundle, replacing
     * any existing value for the given key.
     *
     * @param key a String, or null
     * @param value a char, or null
     */
    public static native void putChar(long nativePtr, String key, char value);

    /**
     * Inserts a short value into the mapping of this DataBundle, replacing
     * any existing value for the given key.
     *
     * @param key a String, or null
     * @param value a short
     */
    public static native void putShort(long nativePtr, String key, short value);

    /**
     * Inserts an int value into the mapping of this DataBundle, replacing
     * any existing value for the given key.
     *
     * @param key a String, or null
     * @param value an int, or null
     */
    public static native void putInt(long nativePtr, String key, int value);

    /**
     * Inserts a long value into the mapping of this DataBundle, replacing
     * any existing value for the given key.
     *
     * @param key a String, or null
     * @param value a long
     */
    public static native void putLong(long nativePtr, String key, long value);

    /**
     * Inserts a float value into the mapping of this DataBundle, replacing
     * any existing value for the given key.
     *
     * @param key a String, or null
     * @param value a float
     */
    public static native void putFloat(long nativePtr, String key, float value);

    /**
     * Inserts a double value into the mapping of this DataBundle, replacing
     * any existing value for the given key.
     *
     * @param key a String, or null
     * @param value a double
     */
    public static native void putDouble(long nativePtr, String key, double value);

    /**
     * Inserts a String value into the mapping of this DataBundle, replacing
     * any existing value for the given key.  Either key or value may be null.
     *
     * @param key a String, or null
     * @param value a String, or null
     */
    public static native void putString(long nativePtr, String key, String value);

    /**
     * Returns the value associated with the given key, or false if
     * no mapping of the desired type exists for the given key.
     *
     * @param key a String
     * @return a boolean value
     */
    public static native boolean getBoolean(long nativePtr, String key);

    /**
     * Returns the value associated with the given key, or (byte) 0 if
     * no mapping of the desired type exists for the given key.
     *
     * @param key a String
     * @return a byte value
     */
    public static native byte getByte(long nativePtr, String key);

    /**
     * Returns the value associated with the given key, or (char) 0 if
     * no mapping of the desired type exists for the given key.
     *
     * @param key a String
     * @return a char value
     */
    public static native char getChar(long nativePtr, String key);

    /**
     * Returns the value associated with the given key, or (short) 0 if
     * no mapping of the desired type exists for the given key.
     *
     * @param key a String
     * @return a short value
     */
    public static native short getShort(long nativePtr, String key);

    /**
     * Returns the value associated with the given key, or 0 if
     * no mapping of the desired type exists for the given key.
     *
     * @param key a String
     * @return an int value
     */
    public static native int getInt(long nativePtr, String key);

    /**
     * Returns the value associated with the given key, or 0L if
     * no mapping of the desired type exists for the given key.
     *
     * @param key a String
     * @return a long value
     */
    public static native long getLong(long nativePtr, String key);

    /**
     * Returns the value associated with the given key, or 0.0f if
     * no mapping of the desired type exists for the given key.
     *
     * @param key a String
     * @return a float value
     */
    public static native float getFloat(long nativePtr, String key);

    /**
     * Returns the value associated with the given key, or 0.0 if
     * no mapping of the desired type exists for the given key.
     *
     * @param key a String
     * @return a double value
     */
    public static native double getDouble(long nativePtr, String key);

    /**
     * Returns the value associated with the given key, or null if
     * no mapping of the desired type exists for the given key or a null
     * value is explicitly associated with the key.
     *
     * @param key a String, or null
     * @return a String value, or null
     */
    public static native String getString(long nativePtr, String key);
}

