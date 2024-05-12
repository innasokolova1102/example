package com.inna.core.repo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper( BookMapper.class);

//    @Mappings({
//            @Mapping(target = "name", source = "name"),
//             @Mapping(target = "author", source = "author"),
//             @Mapping(target = "pages", source = "pages")
//    })
    BookDto toDto(Book entity);
}
