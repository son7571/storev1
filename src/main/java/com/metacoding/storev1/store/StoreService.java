package com.metacoding.storev1.store;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StoreService {

    public static Object 상세보기;
    private StoreRepository storeRepository;

    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    // 3번:board 프로젝트의 BoardService 참고
    @Transactional // insert,delete, update시에 사용 : 함수 종료시 commit 됨
    public void 상품삭제(int id) {
        storeRepository.deleteById(id);
    }

    @Transactional
    public void 상품등록(String name, int stock, int price) {
        storeRepository.save(name, stock, price);
    }

    public List<Store> 상품목록() {
        List<Store> storeList = storeRepository.findAll();
        return storeList;
    }

    public Store 상세보기(int id) {
        Store store = storeRepository.findById(id);
        return store;
    }

}
