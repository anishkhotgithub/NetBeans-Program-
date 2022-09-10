var count=1;

function count_time(){
    count++;
    postMessage(count);
    setTimeout("count_time()",1000);
}

count_time();