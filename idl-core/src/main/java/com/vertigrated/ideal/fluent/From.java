package com.vertigrated.ideal.fluent;

import javax.annotation.Nonnull;

public interface From<N,T>
{
    public N from(@Nonnull final T from);
}
