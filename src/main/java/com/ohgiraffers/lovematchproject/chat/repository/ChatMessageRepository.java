package com.ohgiraffers.lovematchproject.chat.repository;

import com.ohgiraffers.lovematchproject.chat.model.entity.ChatMessage;
import com.ohgiraffers.lovematchproject.chat.model.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByChatRoomOrderByTimestampAsc(ChatRoom chatRoom);
    void deleteByChatRoom(ChatRoom chatRoom);
}