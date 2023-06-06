/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiProduct.dto;

import lombok.Data;
import pe.cibertec.ecommerce.ApiProduct.entity.Category;

@Data
public class ProductDto {
    private Long id;
    private String productName;
    private Double unitPrice;
    private Category category;
}
