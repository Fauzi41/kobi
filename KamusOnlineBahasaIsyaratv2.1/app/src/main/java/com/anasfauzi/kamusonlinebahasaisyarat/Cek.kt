package com.anasfauzi.kamusonlinebahasaisyarat

fun main(args: Array<String>){

    var kalimat : String = "Efektif Efisien Eja Ekonomi Evaluasi"

    // for (c in kalimat) {
    //     dataKalimat += when {
    //         c.isLowerCase -> c.toLowerCase
    //         c.isUpperCase -> c.toLowerCase
    //     }
    //     }


    var dummy : String = "null"

    var dataKalimat = kalimat.split(" ")

    if (dataKalimat.size%2 != 0){
        dataKalimat += dummy
    }

    // for (i in 0..dataKalimat.size) {
    //     var dataku : String = dataKalimat[i]
    //     dataku.toLowerCase
    // }
    print(dataKalimat)

    // for (item in dataKalimat) {
    //     var init :String = item
    //     println(init)
    //     print("batas\n")

    // }

    for (i in 1..dataKalimat.size) {
        if(i%2 != 0){
            print("\n")
            print("Gata Ganjil")
            print(i)
            print(dataKalimat[i-1])
            print("\n")
        }else{
            print("\n")
            print("Gata Genap")
            print(i)
            print(dataKalimat[i-1])
            print("\n")

        }


    }
}
