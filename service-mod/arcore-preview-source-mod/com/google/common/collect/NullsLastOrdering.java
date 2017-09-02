package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import javax.annotation.Nullable;

@GwtCompatible(serializable=true)
final class NullsLastOrdering<T>
  extends Ordering<T>
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  final Ordering<? super T> ordering;
  
  NullsLastOrdering(Ordering<? super T> paramOrdering)
  {
    this.ordering = paramOrdering;
  }
  
  public int compare(@Nullable T paramT1, @Nullable T paramT2)
  {
    if (paramT1 == paramT2) {
      return 0;
    }
    if (paramT1 == null) {
      return 1;
    }
    if (paramT2 == null) {
      return -1;
    }
    return this.ordering.compare(paramT1, paramT2);
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof NullsLastOrdering))
    {
      paramObject = (NullsLastOrdering)paramObject;
      return this.ordering.equals(((NullsLastOrdering)paramObject).ordering);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.ordering.hashCode() ^ 0xC9177248;
  }
  
  public <S extends T> Ordering<S> nullsFirst()
  {
    return this.ordering.nullsFirst();
  }
  
  public <S extends T> Ordering<S> nullsLast()
  {
    return this;
  }
  
  public <S extends T> Ordering<S> reverse()
  {
    return this.ordering.reverse().nullsFirst();
  }
  
  public String toString()
  {
    return this.ordering + ".nullsLast()";
  }
}


/* Location:              /Users/tom/Downloads/dex2jar-2.0/classes.jar!/com/google/common/collect/NullsLastOrdering.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */