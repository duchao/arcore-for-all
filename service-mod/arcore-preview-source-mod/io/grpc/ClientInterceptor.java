package io.grpc;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract interface ClientInterceptor
{
  public abstract <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> paramMethodDescriptor, CallOptions paramCallOptions, Channel paramChannel);
}


/* Location:              /Users/tom/Downloads/dex2jar-2.0/classes.jar!/io/grpc/ClientInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */