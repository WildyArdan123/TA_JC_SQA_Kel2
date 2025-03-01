@AbsenPoint
  Feature: AbsentPoint Functionality

    @RegressFilteringData @AddAbsenPoint
      Scenario: Melakukan Valid Penambahan Absen Point
      Given Admin Sudah Berhasil Login
      And Klik Menu Management
      And Klik Menu Absen Point
      And Klik Tambahkan
      When Masukan Nama
      And Masukan Latitude
      And Masukan Longtitude
      And Masukan Maksimal Radius
      And Masukan Description
      And Klik Button Tambah
      And Search Data Yang Baru di Tambahkan
      And Klik Button Search
      Then Menampilkan "TestLocation1" Yang Baru di Tambahkan

    @RegressFilteringData @NegativeAddAbsenPoint
    Scenario: Melakukan Invalid Penambahan Absen Point
      Given Admin Sudah Berhasil Login
      And Klik Menu Management
      And Klik Menu Absen Point
      When Klik Tambahkan
      And Klik Button Tambah
      Then Berhasil Menampilkan "Please fill out this field."

    @RegressFilteringData @SearchAbsenPoint
      Scenario: Melakukan Search Absen Point
      Given Admin Sudah Berhasil Login
      And Klik Menu Management
      And Klik Menu Absen Point
      When Masukan "TestLocation1" Pada Kolom Search
      And Klik Search Button
      Then "TestLocation1" Berhasil di tampilkan
#
      @RegressFilteringData @ResetAbsenPoint
      Scenario: Melakukan Reset Absen Point
        Given Klik Menu Management
        And Klik Menu Absen Point
        When Masukan "TestLocation1" Pada Kolom Search
        And Klik Search Button
        And Klik Reset Button
        Then Kolom Search Kembali Kosong

        @RegressFilteringData @EditAbsenPoint
          Scenario: Melakukan Edit Absen Point
          Given Admin Sudah Berhasil Login
          And Klik Menu Management
          And Klik Menu Absen Point
          When Masukan "TestLocation1" Pada Kolom Search
          And Klik Search Button
          And Klik Button Titik Tiga
          And Klik Edit
          And Masukan Nama Baru
          And Klik Button Simpan
          And Masukan "TestLocation11" Pada Kolom Search
          And Klik Search Button
          Then Berhasil Menampilkan Data Baru "TestLocation11"

          @RegressFilteringData @DeleteAbsenPoint

          Scenario: Melakukan Delete Absen Point
            Given Admin Sudah Berhasil Login
            And Klik Menu Management
            And Klik Menu Absen Point
            When Masukan "TestLocation11" Pada Kolom Search
            And Klik Search Button
            And Klik Button Titik Tiga
            And Klik Delete
            And Klik Button Ya
            And Klik Reset Button
            And Masukan "TestLocation11" Pada Kolom Search
            And Klik Search Button
            Then Data Sudah Tidak di Temukan
