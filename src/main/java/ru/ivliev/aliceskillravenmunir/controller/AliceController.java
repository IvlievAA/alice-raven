package ru.ivliev.aliceskillravenmunir.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ivliev.aliceskillravenmunir.dto.AliceResponse;

import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@RestController
public class AliceController {

    private final ObjectMapper objectMapper;

    @PostMapping("/")
    public ResponseEntity<AliceResponse> alice(@RequestBody Map request) throws JsonProcessingException {
        log.info(objectMapper.writeValueAsString(request));
        return ResponseEntity.ok(new AliceResponse("yes"));
    }

}
