package com.platzi.market.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import com.platzi.market.domain.PurchaseItem;
import com.platzi.market.persistence.entity.CompraProducto;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    
    @Mappings({
        @Mapping(source = "id.idProducto", target = "productId"),
        @Mapping(source = "cantidad", target = "quantity"),
        @Mapping(source = "total", target = "total"),
        @Mapping(source = "estado", target = "active"),
    })
    PurchaseItem toPurchaseItem(CompraProducto compraProducto);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "compra", ignore = true),
        @Mapping(target = "producto", ignore = true),
        @Mapping(target = "id.idCompra", ignore = true),
    })
    CompraProducto toCompraProducto(PurchaseItem purchaseItem);
}
