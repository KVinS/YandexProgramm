<?php
$query = $_GET["query"];
$filter=$_GET["filter"];
$lr=$_GET["lr"];
$l10n=$_GET["l10n"];
$page=$_GET["page"];
$sortby=$_GET["sortby"];
$urlya = 'http://xmlsearch.yandex.ru/xmlsearch?user=KVinS-java&key=03.51068879:5fdd785e33efca2ec7c3914fa7331dba&query='.$query.'&filter='.$filter.'&lr='.$lr.'&l10n='.$l10n.'&page='.$page.'&sortby='.$sortby;
$file = file_get_contents($urlya);
echo $file;
?>