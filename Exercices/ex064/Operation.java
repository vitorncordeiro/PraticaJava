package dev.Main;

public interface Operation<T, U>{
    T operate(T v1, U v2);
}
