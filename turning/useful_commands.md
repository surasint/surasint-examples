See VM flags

 - to show all flags 
    - for running process : jcmd process_id VM.flags -all
    - for no running process : java other_options -XX:+PrintFlagsFinal -version
 - to show Java system properties + flags
    - jinfo process_id
 - to show some flags 
    - jinfo -flags process_id
 - to change some flags at runtime
    - jinfo -flag PrintGCDetails process_id 
