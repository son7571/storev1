package com.metacoding.storev1.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor // jpa 가 ObjectMapping을 위해 new할때 사용함
@Table(name = "store_tb")
@Entity // 설정파일에서 테이블을 생성해준다.
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer stock; // 재고
    private Integer price;

    public void 재고감소(int qty) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '재고감소'");
    }

}
