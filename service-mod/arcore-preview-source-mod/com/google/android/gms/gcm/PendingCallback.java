package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class PendingCallback
  implements Parcelable, ReflectedParcelable
{
  public static final Parcelable.Creator<PendingCallback> CREATOR = new Parcelable.Creator()
  {
    public PendingCallback zzje(Parcel paramAnonymousParcel)
    {
      return new PendingCallback(paramAnonymousParcel);
    }
    
    public PendingCallback[] zznc(int paramAnonymousInt)
    {
      return new PendingCallback[paramAnonymousInt];
    }
  };
  final IBinder zzsA;
  
  public PendingCallback(IBinder paramIBinder)
  {
    this.zzsA = paramIBinder;
  }
  
  public PendingCallback(Parcel paramParcel)
  {
    this.zzsA = paramParcel.readStrongBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getIBinder()
  {
    return this.zzsA;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.zzsA);
  }
}


/* Location:              /Users/tom/Downloads/dex2jar-2.0/classes.jar!/com/google/android/gms/gcm/PendingCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */