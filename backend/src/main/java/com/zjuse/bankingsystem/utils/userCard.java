package com.zjuse.bankingsystem.utils;
import com.zjuse.bankingsystem.utils.*;
/**
 * userCard
 */
public interface userCard {

    public RespResult bindUserAndCard(Long cardId, String id_number);

    public RespResult getAllCard(Long userId);

    public RespResult getAllCard(String id_number);

    public RespResult consume(Long cardId, Double amount, String password);   

    public RespResult transfor(Long cardId, Long targetCardId, Double amount, String password);

    public cardType getCardType(Long cardId); 
}
