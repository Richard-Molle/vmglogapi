package fr.ipme.vmglogapi.controller;

import fr.ipme.vmglogapi.model.Log;
import fr.ipme.vmglogapi.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    @Autowired
    private LogRepository logRepository;

    @GetMapping
    public List<Log> list(){
        return logRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Log get(@PathVariable int id){
        return logRepository.getOne(id);
    }

    @CrossOrigin
    @PostMapping(value = "/{typeLog}")
    public List<Log> readLogs(@PathVariable String typeLog){
        Matcher m;
        List<Log> listLog = new LinkedList<>();
        Log log;

        List<Log> logs = list();
        Pattern p = Pattern.compile(".*"+typeLog+".*");    /////////////////////////////////////////////
        for (int i=0; i<logs.size();i++){
            log = logs.get(i);
            m= p.matcher(log.getContentLog());
            if (m.find()){
                listLog.add(log);
            }
        }
        return listLog;
    }

    @PostMapping
    public Log create(@RequestBody Log log){
        Log savedLog = logRepository.save(log);
        return savedLog;
    }

    @PutMapping(value = "/{id}")
    public Log update(@PathVariable int id, @RequestBody Log log){
        log.setId(id);
        Log savedLog = logRepository.save(log);
        return savedLog;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id){
        logRepository.deleteById(id);
    }

}
