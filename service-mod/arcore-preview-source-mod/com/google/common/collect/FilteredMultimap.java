package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import java.util.Map.Entry;

@GwtCompatible
abstract interface FilteredMultimap<K, V>
  extends Multimap<K, V>
{
  public abstract Predicate<? super Map.Entry<K, V>> entryPredicate();
  
  public abstract Multimap<K, V> unfiltered();
}


/* Location:              /Users/tom/Downloads/dex2jar-2.0/classes.jar!/com/google/common/collect/FilteredMultimap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */