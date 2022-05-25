package com.example.floandroid.model


/**
 * @param singer: 아티스트명
 * @param album: 앨범명
 * @param title: 곡명
 * @param image: 앨범 커버 이미지
 * @param file: mp3 파일의 링크
 * @param lyrics: 시간으로 구분 된 가사.
 * 가사의 각 줄 마다 해당 가사가 표시되기 시작되어야 할 시간이 분:초:밀리초 단위로 적혀 있으며, 시
 * 이를 활용하여 현재 재생되는 곡의 가사를 표시해야 합니다.
 */
data class MusicData(
    val singer: String?, val album: String?, val title: String?,
    val image: String?, val file: String?, val lyrics: String?
) {

    constructor() : this(
        null,null,null,null,null, null
    )

}