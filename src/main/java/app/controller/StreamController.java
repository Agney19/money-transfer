package app.controller;

import app.dto.BroadcastInfoDto;
import app.dto.StreamDoubleInfoDto;
import app.dto.StreamInfoDto;
import app.service.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class StreamController {

    @Autowired
    private StreamService streamService;

    @PostMapping("broadcast")
    public void createBroadcast(@RequestBody BroadcastInfoDto dto) {
        streamService.createBroadcast(dto);
    }

    @PostMapping("stream")
    public void startStream(@RequestBody StreamInfoDto dto) {
        streamService.startStream(dto);
    }

    @DeleteMapping("stream")
    public void finishStream(@RequestBody StreamInfoDto dto) {
        streamService.finishStream(dto);
    }

    @PostMapping("stream/double")
    public void startDoubleStream(@RequestBody StreamDoubleInfoDto dto) {
        streamService.startDoubleStream(dto);
    }
}
