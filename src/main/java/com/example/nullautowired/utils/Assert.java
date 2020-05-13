/**
 * Copyright (c) Coveo Solutions Inc.
 */
package com.example.nullautowired.utils;

import java.util.Objects;
import java.util.stream.Stream;

public final class Assert
{
    public static void noNullElements(Object... objects)
    {
        if (Stream.of(objects).anyMatch(Objects::isNull)) {
            throw new IllegalArgumentException();
        }
    }
}
