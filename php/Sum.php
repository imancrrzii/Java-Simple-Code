<?php

echo "Berapa banyak bilangan yang mau dihitung? ";
$n = (int) trim(fgets(STDIN)); // Baca input n, pastikan integer

$total = 0; // Untuk menampung jumlah total

for ($i = 1; $i <= $n; $i++) {
    echo "Masukkan bilangan ke-$i: ";
    $bilangan = (int) trim(fgets(STDIN)); // Baca bilangan ke-i
    $total += $bilangan; // Tambahkan ke total
}

echo "Jumlah total dari $n bilangan adalah: $total\n";

$average = $total / $n;
echo "Average: $average";
