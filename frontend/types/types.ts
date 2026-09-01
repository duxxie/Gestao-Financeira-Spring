export interface User {
    id: number,
    name: string,
    email: string,
    cpf: string
}

export interface Pagination {
  currentPage: number
  totalPages: number
  totalItems: number
  itemsPerPage: number
}

export interface UsersResponse {
  data: User[],
  pagination: Pagination
}

export interface UserFilters {
  search?: string
  page?: number
  limit?: number
}

export type CreateUserDTO = Omit<User, 'id'>
export type UpdateUserDTO = Partial<CreateUserDTO>