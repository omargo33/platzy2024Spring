package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.PurchaseItem;
import com.platzi.market.persistence.entity.CompraProducto;
import com.platzi.market.persistence.entity.CompraProductoPk;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-29T11:50:13-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class PurchaseItemMapperImpl implements PurchaseItemMapper {

    @Override
    public PurchaseItem toPurchaseItem(CompraProducto compraProducto) {
        if ( compraProducto == null ) {
            return null;
        }

        PurchaseItem purchaseItem = new PurchaseItem();

        Integer idProducto = compraProductoIdIdProducto( compraProducto );
        if ( idProducto != null ) {
            purchaseItem.setProductId( idProducto );
        }
        if ( compraProducto.getCantidad() != null ) {
            purchaseItem.setQuantity( compraProducto.getCantidad() );
        }
        if ( compraProducto.getTotal() != null ) {
            purchaseItem.setTotal( compraProducto.getTotal() );
        }
        if ( compraProducto.getEstado() != null ) {
            purchaseItem.setActive( compraProducto.getEstado() );
        }

        return purchaseItem;
    }

    @Override
    public CompraProducto toCompraProducto(PurchaseItem purchaseItem) {
        if ( purchaseItem == null ) {
            return null;
        }

        CompraProducto compraProducto = new CompraProducto();

        compraProducto.setId( purchaseItemToCompraProductoPk( purchaseItem ) );
        compraProducto.setCantidad( purchaseItem.getQuantity() );
        compraProducto.setTotal( purchaseItem.getTotal() );
        compraProducto.setEstado( purchaseItem.isActive() );

        return compraProducto;
    }

    private Integer compraProductoIdIdProducto(CompraProducto compraProducto) {
        if ( compraProducto == null ) {
            return null;
        }
        CompraProductoPk id = compraProducto.getId();
        if ( id == null ) {
            return null;
        }
        Integer idProducto = id.getIdProducto();
        if ( idProducto == null ) {
            return null;
        }
        return idProducto;
    }

    protected CompraProductoPk purchaseItemToCompraProductoPk(PurchaseItem purchaseItem) {
        if ( purchaseItem == null ) {
            return null;
        }

        CompraProductoPk compraProductoPk = new CompraProductoPk();

        compraProductoPk.setIdProducto( purchaseItem.getProductId() );

        return compraProductoPk;
    }
}
