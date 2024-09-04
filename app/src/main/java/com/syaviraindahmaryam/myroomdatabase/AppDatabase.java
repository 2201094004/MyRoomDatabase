package com.syaviraindahmaryam.myroomdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.syaviraindahmaryam.myroomdatabase.DAO.ProdukDao;
import com.syaviraindahmaryam.myroomdatabase.Model.Produk;

@Database(entities = {Produk.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public  abstract ProdukDao produkDao();
}
