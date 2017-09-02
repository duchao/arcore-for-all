package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.zza;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultStore;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

public final class zzzz<R extends Result>
  extends OptionalPendingResult<R>
{
  private final zzyt<R> zzaOE;
  
  public zzzz(PendingResult<R> paramPendingResult)
  {
    if (!(paramPendingResult instanceof zzyt)) {
      throw new IllegalArgumentException("OptionalPendingResult can only wrap PendingResults generated by an API call.");
    }
    this.zzaOE = ((zzyt)paramPendingResult);
  }
  
  public R await()
  {
    return this.zzaOE.await();
  }
  
  public R await(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.zzaOE.await(paramLong, paramTimeUnit);
  }
  
  public void cancel()
  {
    this.zzaOE.cancel();
  }
  
  public R get()
  {
    if (isDone()) {
      return await(0L, TimeUnit.MILLISECONDS);
    }
    throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
  }
  
  public boolean isCanceled()
  {
    return this.zzaOE.isCanceled();
  }
  
  public boolean isDone()
  {
    return this.zzaOE.isReady();
  }
  
  public void setResultCallback(ResultCallback<? super R> paramResultCallback)
  {
    this.zzaOE.setResultCallback(paramResultCallback);
  }
  
  public void setResultCallback(ResultCallback<? super R> paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    this.zzaOE.setResultCallback(paramResultCallback, paramLong, paramTimeUnit);
  }
  
  public void store(ResultStore paramResultStore, int paramInt)
  {
    this.zzaOE.store(paramResultStore, paramInt);
  }
  
  @NonNull
  public <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> paramResultTransform)
  {
    return this.zzaOE.then(paramResultTransform);
  }
  
  public void zza(PendingResult.zza paramzza)
  {
    this.zzaOE.zza(paramzza);
  }
  
  public void zzfB(int paramInt)
  {
    this.zzaOE.zzfB(paramInt);
  }
  
  public Integer zzxe()
  {
    return this.zzaOE.zzxe();
  }
}


/* Location:              /Users/tom/Downloads/dex2jar-2.0/classes.jar!/com/google/android/gms/internal/zzzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */