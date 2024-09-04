package com.syaviraindahmaryam.myroomdatabase.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.syaviraindahmaryam.myroomdatabase.Model.Produk;

import java.util.List;

@Dao
public interface ProdukDao {

    @Insert //insert into produk (id, nama, deskripsi)
    void insert(Produk produk);

    @Update
    void update(Produk produk);

    @Delete
    void delete(Produk produk);

    @Query("SELECT * FROM produk")
    List<Produk> getAll();
}
