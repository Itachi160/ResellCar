package com.spring.jwt.Interfaces;

public interface ProfilePhotoService {

    public void addprofilephoto(byte[] data);
    public byte[] getprofilePhotoData(Long id);
    public void updateprofilePhoto(Long id, byte[] data);
    public void deleteprofilePhoto(Long id);

     public void setUserPhotoID(int UserId, long profilePhotId);


}
