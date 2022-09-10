var i=0;
function SeriesDemo()
{
    i++;
    postMessage(i);   
    setTimeout("SeriesDemo()",1000);
 
}
SeriesDemo();
