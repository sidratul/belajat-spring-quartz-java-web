package com.sidratul.belajar.quartz;

import com.sidratul.belajar.quartz.produk.Produk;
import com.sidratul.belajar.quartz.produk.ProdukDao;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RunProdukTask {
    @Autowired private ProdukDao pd;
    
    public void tampilHallo(){
        try {
            Random r = new Random();
            
            Produk p = new Produk();
            p.setKodeProduk("p00"+r.nextInt());
            p.setNama("namax"+r.nextInt());
            p.setTerakhirUpadate(new Date());
            p.setHarga(new BigDecimal(10000));        
            pd.simpanProduk(p);
        } catch (SQLException ex) {
            Logger.getLogger(RunProdukTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}